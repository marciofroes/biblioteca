package br.edu.infnet.appBiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevistaController {

	@GetMapping(value = "/revista/lista")
	public String telaLista() {
		return "revista/lista";
	}
	
}
