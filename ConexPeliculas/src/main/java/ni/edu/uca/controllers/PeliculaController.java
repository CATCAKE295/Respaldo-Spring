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
import org.springframework.web.bind.annotation.RestController;

import ni.edu.uca.models.Clasificacion;
import ni.edu.uca.models.Pelicula;
import ni.edu.uca.services.PeliculaService;

@RestController
@RequestMapping(path = "/pelicula")
public class PeliculaController {
	
	@Autowired
	PeliculaService peS;
	
	@RequestMapping("/listar")
	public List<Map<String, Object>> listar(){
		return peS.ListarRegistro();
	}
	
	
	@PostMapping("/agregar")
	public String agregarCla(@RequestBody Pelicula p) {
		String msg = "Error al guardar registro...";
		int b = peS.GuardarRegistro(p);
		if(b==1) msg = "Registro guardado satisfactoriamente";
		return msg;
	}
	
	
	@PutMapping("/actualizar/{id}")
	public String editarCla(@RequestBody Pelicula p, @PathVariable int id, Model model){
		String msg = "\"Error al editar registro...";
		int b = peS.EditarRegistro(p);
		if(b == 1) msg ="Registro editado satisfactoriamente...";
		return msg;
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarCla(@PathVariable int id, Model model) {
		String msg = "Error al eliminar registro...";
		int b = peS.EliminarRegistro(id);
		if(b == 1) msg = "Registro Eliminado satisfactoriamente...";
		return msg;
	}
	
	
	
	

}
