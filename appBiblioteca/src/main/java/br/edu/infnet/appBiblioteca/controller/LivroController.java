package br.edu.infnet.appBiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Livro;
import br.edu.infnet.model.service.LivroService;

@Controller
public class LivroController {

	@Autowired
	private LivroService livroService;
	
	
	@GetMapping(value = "livro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		livroService.excluir(id);
		return "redirect:livro/lista";
	}
	
	@GetMapping(value = "/livro/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", livroService.obterLista());
		return "livro/lista";
	}
	
	@PostMapping(value = "/livro/incluir")
	public String incluisao(Livro livro) {
		livroService.incluir(livro);
		return "redirect:/";
	}
	
	
}
