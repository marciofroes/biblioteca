package br.edu.infnet.appBiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.model.domain.Responsavel;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class ResponsavelController {
	
	private static Map<Integer, Responsavel> mapaResponsavel = new HashMap<>();
	private static Integer id = 1;
	

	public static void incluir(Responsavel responsavel) {
		responsavel.setId(id++);
		mapaResponsavel.put(responsavel.getId(), responsavel);
		AppImpressao.relatorio("Inclusao da responsavel : " + responsavel.getId(), responsavel);
	}
	
	public Collection<Responsavel> obterLista(){
		return mapaResponsavel.values();
	}
	
	public static void excluir(Integer id) {
		mapaResponsavel.remove(id);
	}
	

	@GetMapping(value = "responsavel/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:responsavel/lista";
	}
	

	@GetMapping(value = "/responsavel/lista")
	public String telaLista() {
		return "responsavel/lista";
	}
	
}
