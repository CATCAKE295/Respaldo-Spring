package ni.edu.uca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ni.edu.uca.services.ClasificacionService;

@RestController
@RequestMapping(path = "/clasificacion")
public class ClasificacionController {

	@Autowired
	ClasificacionService claS;
}
