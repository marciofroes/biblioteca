package br.edu.infnet.model.domain.app;

import java.util.Iterator;
import java.util.List;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public class Classe implements IPrinter{

	private String nome;
	private String dedscricao;
	
	private List<Atributo> atributos;
	
	public String getDedscricao() {
		return dedscricao;
	}
	public void setDedscricao(String dedscricao) {
		this.dedscricao = dedscricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Atributo> getAtributos() {
		return atributos;
	}
	public void setAtributos(List<Atributo> atributos) {
		this.atributos = atributos;
	}
	@Override
	public void impressao() {
		System.out.println("- - "+ nome + "|" + dedscricao);
		for (Atributo atributo : atributos) {
			atributo.impressao();
		}
	}
}
