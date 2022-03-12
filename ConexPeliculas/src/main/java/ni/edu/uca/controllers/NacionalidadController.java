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

import ni.edu.uca.models.Nacionalidad;
import ni.edu.uca.services.NacionalidadService;

@RestController
@RequestMapping(path = "/Nacionalidad")
public class NacionalidadController {

	@Autowired
	NacionalidadService NacS;
	
	@RequestMapping("/listar")
	public List<Map<String,Object>> listar(){
		
		return NacS.ListarRegistro();
		
	}
	
	
	@PostMapping("/agregar")
	public String agregarNac(@RequestBody Nacionalidad nac) {
		
		String msg = "Error al guardar el Registro...";
		int b = NacS.GuardarRegistro(nac);
		if(b == 1) msg ="Registro Guardado Correctamente..." ;
		return msg;
		
	}
	
	
	@PutMapping("/editar/{id}")
	public String editarNac(@RequestBody Nacionalidad nac, @PathVariable int id,Model model) {
		String msg = "Error al guardar el Registro...";
		nac.setIdNacionalidad(id);
		int b = NacS.EditarRegistro(nac);
		if(b == 1) msg = "Cambios Realizados Correctamente";
		return msg;
		
	}
	
	
	@DeleteMapping("/eliminar/{id}")
	public String borrarNac(@PathVariable int id, Model model){
		
		String msg = "Error al guardar el Registro...";
		int b = NacS.EliminarRegistro(id);
		if(b == 1) msg = "Registro Eliminado Correctamente";
		return msg;
		
	}
	
}
	
	
