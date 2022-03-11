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
import ni.edu.uca.services.ClasificacionService;

@RestController
@RequestMapping(path = "/clasificacion")
public class ClasificacionController {

	@Autowired
	ClasificacionService claS;
	
	@RequestMapping("/listar")
	public List<Map<String, Object>> listar(){
		return claS.ListarRegistro();
	}
	
	@PostMapping("/agregar")
	public String agregarCla(@RequestBody Clasificacion c) {
		String msg = "Error al guardar registro...";
		int b = claS.GuardarRegistro(c);
		if(b==1) msg = "Registro guardado satisfactoriamente";
		return msg;
	}
	
	@PutMapping("/actualizar/{id}")
	public String editarCla(@RequestBody Clasificacion c, @PathVariable int id, Model model){
		String msg = "\"Error al editar registro...";
		int b = claS.EditarRegistro(c);
		if(b == 1) msg ="Registro editado satisfactoriamente...";
		return msg;
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarCla(@PathVariable int id, Model model) {
		String msg = "Error al eliminar registro...";
		int b = claS.EliminarRegistro(id);
		if(b == 1) msg = "Registro Eliminado satisfactoriamente...";
		return msg;
	}
	
}
