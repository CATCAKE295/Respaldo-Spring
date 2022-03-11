package ni.edu.uca.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.models.Clasificacion;
import ni.edu.uca.models.Nacionalidad;

public interface NacionalidadIRepository {

	public List<Map<String, Object>> ListarRegistro();
	public int GuardarRegistro(Nacionalidad n);
	public int EditarRegistro(Nacionalidad n);
	public int EliminarRegistro(int id);
	
}
