package ni.edu.uca.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.models.Idioma;

public interface IdiomaIRepository {
	
	public List<Map<String, Object>> MostrarRegistro();
	public int GuardarRegistro(Idioma idi);
	public int EditarRegistro(Idioma idi);
	public int EliminarRegistro(int id);

}
