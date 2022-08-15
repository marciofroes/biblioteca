package br.edu.infnet.appBiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivroController {

	@GetMapping(value = "/livro/lista")
	public String telaLista() {
		return "livro/lista";
	}
	
}
