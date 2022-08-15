package br.edu.infnet.appBiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppControler {

	@GetMapping(value = "/")
	public String telaHome() {
		return "home";
	}
	
}
