package br.edu.infnet.model.domain;

import java.math.BigDecimal;

public class Jornal extends Produto {

	public boolean disponivel;
	public String edicao;
	public String tema;
	
	public Jornal(String nome, String formato, BigDecimal valor) {
		super(nome, formato, valor);
	}

	
	@Override
	public String toString() {
		return disponivel + ";" + edicao + ";" + tema + ";" + super.toString();
	}

}
