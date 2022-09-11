package br.edu.infnet.appBiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Revista;
import br.edu.infnet.model.service.RevistaService;

@Controller
public class RevistaController {


@Autowired
private RevistaService revistaService;
	

	@GetMapping(value = "revista/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		revistaService.excluir(id);
		return "redirect:revista/lista";
	}

	@GetMapping(value = "/revista/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", revistaService.obterLista());
		return "revista/lista";
	}
	
	@PostMapping(value = "/revista/incluir")
	public String incluisao(Revista revista) {
		revistaService.incluir(revista);
		return "redirect:/";
	}
	

}
