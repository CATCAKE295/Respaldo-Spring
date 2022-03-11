package ni.edu.uca.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ni.edu.uca.models.Clasificacion;

public class ClasificacionDRepository implements ClasificacionIRepository   {

	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		List<Map<String,Object>> lista = template.queryForList("Select * from Clasificacion");
		return lista;
	}

	@Override
	public int GuardarRegistro(Clasificacion c) {
		int b = 0;
		b = template.update("Insert into Clasificacion(abreviacion, nombre, activo) values(?, ?, ?)",
				new Object[] {c.getAbreviacion(),c.getNombre(),c.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Clasificacion c) {
		int b = 0;
		b = template.update("Update Clasificacion set abreviacion = ?, nombre = ?, activo = ? where idClasificacion = ?",
				new Object[] {c.getAbreviacion(), c.getNombre(),c.isActivo(),c.getIdClasificacion()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("Delete from Clasificacion where idClasificacion = ?", id);
		return b;
	}

}
