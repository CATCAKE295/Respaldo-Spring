package ni.edu.uca.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ni.edu.uca.models.Nacionalidad;

public class NacionalidadDRepository implements NacionalidadIRepository {

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		List<Map<String, Object>> lista = template.queryForList("Select * from Nacionalidad");
		return lista;
		
	}

	@Override
	public int GuardarRegistro(Nacionalidad n) {
		int b = 0;
		b = template.update("Insert into Nacionalidad(nombre,activo) values (?, ?)", 
				new Object[] {n.getNombre(), n.isActivo()});
		return b;	
		}

	@Override
	public int EditarRegistro(Nacionalidad n) {
		int b = 0;
		b = template.update("Update Nacionalidad set nombre = ?, activo = ? where idNacionalidad = ?",
				new Object[] {n.getNombre(),n.isActivo(),n.getIdNacionalidad()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("Delete from Nacionalidad where idNacionalidad = ?",id);
		return b;
	}

}
