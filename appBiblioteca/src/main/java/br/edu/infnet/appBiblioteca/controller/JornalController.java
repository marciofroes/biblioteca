package br.edu.infnet.appBiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JornalController {

	@GetMapping(value = "/jornal/lista")
	public String telaLista() {
		return "jornal/lista";
	}
	
}
