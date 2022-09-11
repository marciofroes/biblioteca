package br.edu.infnet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Biblioteca;
import br.edu.infnet.model.test.AppImpressao;

@Service
public class BibliotecaService {
	private static Map<Integer, Biblioteca> mapaBiblioteca = new HashMap<>();
	private static Integer id = 1;
	
	public void incluir(Biblioteca biblioteca) {
		biblioteca.setId(id++);
		mapaBiblioteca.put(biblioteca.getId(), biblioteca);
		AppImpressao.relatorio("Inclusao da Biblioteca :" + biblioteca.getDescricao() ,biblioteca);
		
	}
	
	public Collection<Biblioteca> obterLista() {
		return mapaBiblioteca.values();
	}

	public void excluir(Integer id2) {
		mapaBiblioteca.remove(id);
		
	}
	
	

}
