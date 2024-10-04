package com.ProyectoDavidDeportes.David.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping
	public String index() {
		return "index";
	}

}
