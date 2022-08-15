package br.edu.infnet.model.domain;

public abstract class Produto {

	public String nome;
	public String formato;
	public float valor;
	
	public Produto(String nome, String formato, float valor) {
		super();
		this.nome = nome;
		this.formato = formato;
		this.valor = valor;
	}
	
	public float calcularEmprestimo() {
		return valor * 2;
	}
	
	public abstract void impressao();
	
	@Override
	public String toString() {
		return nome + ";" + formato + ";" + valor;
	}
	
}
