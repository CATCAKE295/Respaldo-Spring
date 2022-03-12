package ni.edu.uca.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ni.edu.uca.models.Pelicula;

public class PeliculaDRepository implements PeliculaIRepository {

	@Autowired
	JdbcTemplate template;
	
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		List<Map<String, Object>> lista = template.queryForList("Select * from Pelicula");
		return lista;
	}

	@Override
	public int GuardarRegistro(Pelicula p) {
		int b = 0;
		b = template.update("Insert into Pelicula(titulo,tipoMetraje,nacionalidad,clasificacion,duracion,sinopsis) values (?,?,?,?,?,?)", 
				new Object[] {p.getTitulo(), p.getTipoMetraje(),p.getNacionalidad(),p.getClasificacion(),p.getDuracion(),p.getSinopsis()});
		return b;	
	}

	@Override
	public int EditarRegistro(Pelicula p) {
		int b = 0;
		b = template.update("Update Pelicula set titulo = ?, tipoMetraje = ?, nacionalidad = ?, clasificacion = ?, duracion = ?, sinopsis = ?  where idPelicula = ?",
				new Object[] {p.getTitulo(), p.getTipoMetraje(),p.getNacionalidad(),p.getClasificacion(),p.getDuracion(),p.getSinopsis(),p.getIdPelicula()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("Delete from Pelicula  where idPelicula = ?",id);
		return b;
	}

}
