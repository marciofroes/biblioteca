package br.edu.infnet.model.domain.app;

import java.util.List;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public class Projeto implements IPrinter{

	private String nome;
	private String descricao;
	private List<Classe> classe;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Classe> getClasse() {
		return classe;
	}

	public void setClasse(List<Classe> classe) {
		this.classe = classe;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public void impressao() {
		System.out.println("- - "+ nome + "|" + descricao);
		for (Classe classe : classe) {
			classe.impressao();
		}
		
	}

}
