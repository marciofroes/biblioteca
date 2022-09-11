package br.edu.infnet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Jornal;
import br.edu.infnet.model.test.AppImpressao;

@Service
public class JornalService {

	private static Map<Integer, Jornal> mapaJornal = new HashMap<>();
	private static Integer id = 1;
	
	public  void incluir(Jornal jornal) {
		jornal.setId(id++);
		mapaJornal.put(jornal.getId(), jornal);
		AppImpressao.relatorio("Inclusao do Jornal de :" + jornal.getEdicao() ,jornal);
	}
	
	public Collection<Jornal> obterLista(){
		return mapaJornal.values();
	}
	
	public  void excluir(Integer id) {
		mapaJornal.remove(id);
	}
}
