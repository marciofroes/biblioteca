package br.edu.infnet.model.domain.app;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public class Atributo implements IPrinter{
	private String nome;
	private String dedscricao;
	private String tipo;
	
	public Atributo(String nome, String dedscricao, String tipo) {
		super();
		this.nome = nome;
		this.dedscricao = dedscricao;
		this.tipo = tipo;
	}
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public String toString() {
		return toString().format("%s %s: %s", tipo, nome, dedscricao);
	}
	
	
	@Override
	public void impressao() {
		System.out.println(this);
		
	}
}
