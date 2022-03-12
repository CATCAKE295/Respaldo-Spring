package ni.edu.uca.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import ni.edu.uca.models.Pelicula;
import ni.edu.uca.repositories.PeliculaDRepository;
import ni.edu.uca.repositories.PeliculaIRepository;

public class PeliculaService implements PeliculaIRepository {

	@Autowired
	PeliculaDRepository DRPe;
	
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		
		return DRPe.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Pelicula p) {
		// TODO Auto-generated method stub
		return DRPe.GuardarRegistro(p);
	}

	@Override
	public int EditarRegistro(Pelicula p) {
		// TODO Auto-generated method stub
		return DRPe.EditarRegistro(p);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return DRPe.EliminarRegistro(id);
	}

}
