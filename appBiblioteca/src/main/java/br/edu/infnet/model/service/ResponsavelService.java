package br.edu.infnet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Responsavel;
import br.edu.infnet.model.test.AppImpressao;

@Service
public class ResponsavelService {

	private static Map<Integer, Responsavel> mapaResponsavel = new HashMap<>();
	private static Integer id = 1;
	

	public  void incluir(Responsavel responsavel) {
		responsavel.setId(id++);
		mapaResponsavel.put(responsavel.getId(), responsavel);
		AppImpressao.relatorio("Inclusao da responsavel : " + responsavel.getId(), responsavel);
	}
	
	public Collection<Responsavel> obterLista(){
		return mapaResponsavel.values();
	}
	
	public  void excluir(Integer id) {
		mapaResponsavel.remove(id);
	}
}
