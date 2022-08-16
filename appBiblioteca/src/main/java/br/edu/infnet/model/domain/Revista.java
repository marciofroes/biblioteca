package br.edu.infnet.model.domain;

import java.util.Date;

public class Revista extends Produto {

	private String titulo;
	private String edicaoEspecial;
	private Date dataPublicacao;
	private boolean disponivel;
	

	@Override
	public float calcularEmprestimo() {
		float valorEdicao = 10;
		return  getValor() + valorEdicao ;
	}
	
	public Revista(String nome, String formato, float valor,int codigo) {
		super(nome, formato, valor,codigo);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEdicao() {
		return edicaoEspecial;
	}
	public void setEdicao(String edicao) {
		this.edicaoEspecial = edicao;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	

	@Override
	public String toString() {
		return edicaoEspecial + " ; " +  titulo + " ; " + disponivel + super.toString();
	}
	
	@Override
	public void impressao() {
		System.out.println("#Revista");
		System.out.println(this);
		
	}
}
