package br.edu.infnet.model.domain;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public abstract class Produto implements IPrinter {

	private String nome;
	private String formato;
	private float valor;
	
	public Produto(String nome, String formato, float valor) {
		super();
		this.nome = nome;
		this.formato = formato;
		this.valor = valor;
	}
	
	
	
	public abstract float calcularEmprestimo();

	
	@Override
	public String toString() {
		return nome + ";" + formato + ";" + valor;
	}
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getFormato() {
		return formato;
	}



	public void setFormato(String formato) {
		this.formato = formato;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}


}