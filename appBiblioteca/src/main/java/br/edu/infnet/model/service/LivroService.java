package br.edu.infnet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Livro;
import br.edu.infnet.model.test.AppImpressao;

@Service
public class LivroService {

	private static Map<Integer, Livro> mapaLivro = new HashMap<>();
	private static Integer id = 1;
	
	
	public void incluir(Livro livro) {
		livro.setId(id++);
		mapaLivro.put(livro.getId(), livro);
		AppImpressao.relatorio("Inclusao do livro  :" + livro.getNome() ,livro);
	}
	
	public Collection<Livro> obterLista(){
		return mapaLivro.values();
	}
	
	public  void excluir(Integer id) {
		mapaLivro.remove(id);
	}
}
