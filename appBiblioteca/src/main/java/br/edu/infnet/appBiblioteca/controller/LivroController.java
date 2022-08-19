package br.edu.infnet.appBiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.model.domain.Livro;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class LivroController {

	private static Map<Integer, Livro> mapaLivro = new HashMap<>();
	private static Integer id = 1;
	
	
	public static void incluir(Livro livro) {
		livro.setId(id++);
		mapaLivro.put(livro.getId(), livro);
		AppImpressao.relatorio("Inclusao do livro  :" + livro.getNome() ,livro);
	}
	
	public Collection<Livro> obterLista(){
		return mapaLivro.values();
	}
	
	public static void excluir(Integer id) {
		mapaLivro.remove(id);
	}
	
	@GetMapping(value = "livro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:livro/lista";
	}
	
	@GetMapping(value = "/livro/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "livro/lista";
	}
	
}
