package ni.edu.uca.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import ni.edu.uca.models.Nacionalidad;
import ni.edu.uca.repositories.NacionalidadDRepository;
import ni.edu.uca.repositories.NacionalidadIRepository;

public class NacionalidadService implements NacionalidadIRepository {

	@Autowired
	NacionalidadDRepository DRNa;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return DRNa.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Nacionalidad n) {
		// TODO Auto-generated method stub
		return DRNa.GuardarRegistro(n);
	}

	@Override
	public int EditarRegistro(Nacionalidad n) {
		// TODO Auto-generated method stub
		return DRNa.EditarRegistro(n);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return DRNa.EliminarRegistro(id);
	}
	
	

}
