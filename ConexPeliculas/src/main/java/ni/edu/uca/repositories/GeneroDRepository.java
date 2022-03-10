package ni.edu.uca.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ni.edu.uca.models.Genero;

public class GeneroDRepository implements GeneroIRepository {
	
	@Autowired
	JdbcTemplate template;
	
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		
		List<Map<String, Object>> lista = template.queryForList("Select * from Genero");
		
		return lista;
	}

	@Override
	public int GuardarRegistro(Genero genero) {
		int b = 0;
		b = template.update("Insert into Genero(nombre,activo) values (?, ?)", 
				new Object[] {genero.getNombre(), genero.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Genero genero) {
		int b = 0;
		b = template.update("Update Genero set nombre = ?, activo = ? where idGenero = ?",
				new Object[] {genero.getNombre(),genero.isActivo(),genero.getIdGenero()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("Delete from Genero where idGenero = ?",id);
		return b;
	}
	
	

}
