package ni.edu.uca.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ni.edu.uca.models.Idioma;

public class IdiomaDRepository implements IdiomaIRepository {

	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		
		List<Map<String, Object>> lista = template.queryForList("Select * from Idioma");
		
		return lista;
	}

	@Override
	public int GuardarRegistro(Idioma idi) {
		int b = 0;
		b = template.update("Insert into Idioma(nombre,activo) values (?, ?)", 
				new Object[] {idi.getNombre(), idi.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Idioma idi) {
		int b = 0;
		b = template.update("Update Idioma set nombre = ?, activo = ? where idIdioma = ?",
				new Object[] {idi.getNombre(),idi.isActivo(),idi.getIdIdioma()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("Delete from Idioma where idIdioma = ?",id);
		return b;
	}

}
