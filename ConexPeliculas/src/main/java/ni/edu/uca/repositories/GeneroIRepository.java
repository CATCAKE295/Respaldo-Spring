package ni.edu.uca.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.models.Genero;

public interface GeneroIRepository {
	
	public List<Map<String, Object>> MostrarRegistro();
	public int GuardarRegistro(Genero genero);
	public int EditarRegistro(Genero genero);
	public int EliminarRegistro(int id);
	

}
