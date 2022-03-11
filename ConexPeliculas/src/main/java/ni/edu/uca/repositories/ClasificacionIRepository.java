package ni.edu.uca.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.models.Clasificacion;

public interface ClasificacionIRepository {

	public List<Map<String, Object>> ListarRegistro();
	public int GuardarRegistro(Clasificacion c);
	public int EditarRegistro(Clasificacion c);
	public int EliminarRegistro(int id);
	
	
}
