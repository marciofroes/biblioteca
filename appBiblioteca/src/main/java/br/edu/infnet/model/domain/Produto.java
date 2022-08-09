package br.edu.infnet.model.domain;

import java.math.BigDecimal;

public class Produto {

	public String nome;
	public String formato;
	public BigDecimal valor;
	
	public Produto(String nome, String formato, BigDecimal valor) {
		super();
		this.nome = nome;
		this.formato = formato;
		this.valor = valor;
	}
	
	
	@Override
	public String toString() {
		return nome + ";" + formato + ";" + valor;
	}
	
}
