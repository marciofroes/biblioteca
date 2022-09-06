package br.edu.infnet.appBiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.model.domain.Biblioteca;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class BibliotecaController {
	
	private static Map<Integer, Biblioteca> mapaBiblioteca = new HashMap<>();
	private static Integer id = 1;
	
	public static void incluir(Biblioteca biblioteca) {
		biblioteca.setId(id++);
		mapaBiblioteca.put(biblioteca.getId(), biblioteca);
		AppImpressao.relatorio("Inclusao da Biblioteca :" + biblioteca.getDescricao() ,biblioteca);
		
	}
	

	@GetMapping(value = "/biblioteca/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "biblioteca/lista";
		
	}
	
	@GetMapping(value = "biblioteca/{id}/excluir")
	public static void excluir(Integer id) {
		mapaBiblioteca.remove(id);
	}
	
	public Collection<Biblioteca> obterLista() {
		return mapaBiblioteca.values();
	}
	
	
}
