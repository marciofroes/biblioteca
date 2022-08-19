package br.edu.infnet.appBiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.model.domain.Jornal;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class JornalController {
	

	private static Map<Integer, Jornal> mapaJornal = new HashMap<>();
	private static Integer id = 1;
	
	public static void incluir(Jornal jornal) {
		jornal.setId(id++);
		mapaJornal.put(jornal.getId(), jornal);
		AppImpressao.relatorio("Inclusao do Jornal de :" + jornal.getEdicao() ,jornal);
	}
	
	public Collection<Jornal> obterLista(){
		return mapaJornal.values();
	}
	
	public static void excluir(Integer id) {
		mapaJornal.remove(id);
	}

	
	@GetMapping(value = "jornal/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:jornal/lista";
	}
	
	@GetMapping(value = "/jornal/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "jornal/lista";
		
	}
	
}
