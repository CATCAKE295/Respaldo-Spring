package ni.edu.uca.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import ni.edu.uca.models.Clasificacion;
import ni.edu.uca.repositories.ClasificacionDRepository;
import ni.edu.uca.repositories.ClasificacionIRepository;

public class ClasificacionService implements ClasificacionIRepository {
  
	@Autowired
	ClasificacionDRepository cla;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return cla.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Clasificacion c) {
		// TODO Auto-generated method stub
		return cla.GuardarRegistro(c);
	}

	@Override
	public int EditarRegistro(Clasificacion c) {
		// TODO Auto-generated method stub
		return cla.EditarRegistro(c);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return cla.EliminarRegistro(id);
	}
	
}
