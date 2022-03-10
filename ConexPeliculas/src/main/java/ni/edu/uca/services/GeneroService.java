package ni.edu.uca.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.models.Genero;
import ni.edu.uca.repositories.GeneroDRepository;
import ni.edu.uca.repositories.GeneroIRepository;

@Service
public class GeneroService implements GeneroIRepository {
	
	@Autowired
	GeneroDRepository dRGenero;

	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
		return dRGenero.MostrarRegistro();
	}

	@Override
	public int GuardarRegistro(Genero genero) {
		// TODO Auto-generated method stub
		return dRGenero.GuardarRegistro(genero);
	}

	@Override
	public int EditarRegistro(Genero genero) {
		// TODO Auto-generated method stub
		return dRGenero.EditarRegistro(genero);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return dRGenero.EliminarRegistro(id);
	}

	

}
