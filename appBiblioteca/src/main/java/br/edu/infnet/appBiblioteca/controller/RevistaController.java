package br.edu.infnet.appBiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.model.domain.Revista;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class RevistaController {

	private static Map<Integer, Revista> mapaRevista = new HashMap<>();
	private static Integer id = 1;
	

	public static void incluir(Revista revista) {
		revista.setId(id++);
		mapaRevista.put(revista.getId(), revista);
		AppImpressao.relatorio("Inclusao da Revista : " + revista.getNome(), revista);
	}
	
	public Collection<Revista> obterLista(){
		return mapaRevista.values();
	}
	
	public static void excluir(Integer id) {
		mapaRevista.remove(id);
	}
	

	@GetMapping(value = "revista/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:revista/lista";
	}

	@GetMapping(value = "/revista/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "revista/lista";
	}
	
	@PostMapping(value = "/revista/incluir")
	public String incluisao(Revista revista) {
		incluir(revista);
		return "redirect:/";
	}
	

}
