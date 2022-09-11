package br.edu.infnet.appBiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Biblioteca;
import br.edu.infnet.model.service.BibliotecaService;

@Controller
public class BibliotecaController {
	
	
	@Autowired
	private BibliotecaService bibliotecaService;

	@GetMapping(value = "/biblioteca/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", bibliotecaService.obterLista());
		return "biblioteca/lista";
		
	}
	
	@GetMapping(value = "biblioteca/{id}/excluir")
	public String excluir(Integer id) {
		bibliotecaService.excluir(id);
		return "redirect:biblioteca/lista";
	}


	@PostMapping(value = "/biblioteca/incluir")
	public String incluisao(Biblioteca biblioteca) {
		bibliotecaService.incluir(biblioteca);
		return "redirect:/";
	}
	
}
