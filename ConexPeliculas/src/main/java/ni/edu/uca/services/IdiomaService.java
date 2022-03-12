package ni.edu.uca.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import ni.edu.uca.models.Idioma;
import ni.edu.uca.repositories.IdiomaDRepository;
import ni.edu.uca.repositories.IdiomaIRepository;

public class IdiomaService implements IdiomaIRepository {

	@Autowired 
	IdiomaDRepository dRIdioma;
	
	
	@Override
	public List<Map<String, Object>> MostrarRegistro() {
		// TODO Auto-generated method stub
		return dRIdioma.MostrarRegistro();
	}

	@Override
	public int GuardarRegistro(Idioma idi) {
		// TODO Auto-generated method stub
		return dRIdioma.GuardarRegistro(idi);
	}

	@Override
	public int EditarRegistro(Idioma idi) {
		// TODO Auto-generated method stub
		return dRIdioma.EditarRegistro(idi);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return dRIdioma.EliminarRegistro(id);
	}

}
