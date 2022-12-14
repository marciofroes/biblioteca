package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.ProdutoIndisponivelException;

public class Jornal extends Produto {

	private boolean edicaoEspecial;
	private String edicao;
	private String tema;
	
	@Override
	public float calcularEmprestimo() throws ProdutoIndisponivelException {
		if (!isDisponivel()) {
			throw new ProdutoIndisponivelException("Jornal indisponível!");
		}
		
		float valorEdicao = edicaoEspecial ? 22 : 2;   
		return getValor() + valorEdicao;
	}
	

	@Override
	public String toString() {
		return edicaoEspecial + ";" + edicao + ";" + tema + ";" + super.toString();
	}

	
	@Override
	public void impressao() {
		System.out.println("#Jornal");
		System.out.println(this);
		
	}


	public Jornal(String nome, String formato, float valor, int codigo) {
		super(nome, formato, valor,  codigo);
	}

	public String getEdicao() {
		return edicao;
	}


	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}

	

	public boolean isEdicaoEspecial() {
		return edicaoEspecial;
	}

	public void setEdicaoEspecial(boolean edicaoEspecial) {
		this.edicaoEspecial = edicaoEspecial;
	}
	
}
