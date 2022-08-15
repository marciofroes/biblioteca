package br.edu.infnet.model.domain;

public class Jornal extends Produto {

	private boolean edicaoEspecial;
	private String edicao;
	private String tema;
	
	@Override
	public float calcularEmprestimo() {
		
		float valorEdicao = edicaoEspecial ? 22 : 2;   
		return super.calcularEmprestimo() + valorEdicao;
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

	
	public Jornal(String nome, String formato, float valor) {
		super(nome, formato, valor);
	}

	
	@Override
	public String toString() {
		return edicaoEspecial + ";" + edicao + ";" + tema + ";" + super.toString();
	}

	public boolean isEdicaoEspecial() {
		return edicaoEspecial;
	}

	public void setEdicaoEspecial(boolean edicaoEspecial) {
		this.edicaoEspecial = edicaoEspecial;
	}
	
	@Override
	public void impressao() {
		System.out.println("#Jornal");
		System.out.println(this);
		
	}

}
