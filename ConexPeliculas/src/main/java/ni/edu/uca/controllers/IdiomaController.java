package ni.edu.uca.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ni.edu.uca.models.Idioma;
import ni.edu.uca.services.IdiomaService;

public class IdiomaController {

	@Autowired
	IdiomaService idiS;
	
	@RequestMapping("/listar")
	public List<Map<String,Object>> listar() {
		return idiS.MostrarRegistro();
	}
	
	@PostMapping("/agregar")
	public String agregarIdi(@RequestBody Idioma Idi) {
		String msg = "Error al guardar el Registro...";
		int b = idiS.GuardarRegistro(Idi);
		if(b == 1) msg ="Registro Guardado Correctamente..." ;
		return msg;
	}
	
	@PutMapping("/editar/{id}")
	public String editarIdi(@RequestBody Idioma Idi,@PathVariable int id,Model model) {
		
		String msg = "Error al guardar el Registro...";
		Idi.setIdIdioma(id);
		int b = idiS.EditarRegistro(Idi);
		if(b == 1) msg = "Cambios Realizados Correctamente";
		return msg;
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarIdi(@PathVariable int id, Model model) {
		
		String msg = "Error al guardar el Registro...";
		int b = idiS.EliminarRegistro(id);
		if(b == 1) msg = "Registro Eliminado Correctamente";
		return msg;
	}
	
	
	
}
