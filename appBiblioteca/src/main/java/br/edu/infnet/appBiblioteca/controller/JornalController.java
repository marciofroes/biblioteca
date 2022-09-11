package br.edu.infnet.appBiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Jornal;
import br.edu.infnet.model.service.JornalService;

@Controller
public class JornalController {
	

@Autowired
private JornalService jornalService;
	
	@GetMapping(value = "jornal/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		jornalService.excluir(id);
		return "redirect:jornal/lista";
	}
	
	@GetMapping(value = "/jornal/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", jornalService.obterLista());
		return "jornal/lista";
		
	}
	
	@PostMapping(value = "/jornal/incluir")
	public String incluisao(Jornal jornal) {
		jornalService.incluir(jornal);
		return "redirect:/";
	}
	
}
