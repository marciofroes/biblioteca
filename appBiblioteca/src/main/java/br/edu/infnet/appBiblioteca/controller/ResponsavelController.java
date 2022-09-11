package br.edu.infnet.appBiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Responsavel;
import br.edu.infnet.model.service.ResponsavelService;

@Controller
public class ResponsavelController {
	
	@Autowired
	private ResponsavelService responsavelService;
	

	@GetMapping(value = "responsavel/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		responsavelService.excluir(id);
		return "redirect:responsavel/lista";
	}
	

	@GetMapping(value = "/responsavel/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",responsavelService.obterLista());
		return "responsavel/lista";
	}
	
	@PostMapping(value = "/responsavel/incluir")
	public String incluisao(Responsavel responsavel) {
		responsavelService.incluir(responsavel);
		return "redirect:/";
	}
	
	
}
