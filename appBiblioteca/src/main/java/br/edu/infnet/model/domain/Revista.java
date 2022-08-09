package br.edu.infnet.model.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Revista extends Produto {

	private String titulo;
	private String edicao;
	private Date dataPublicacao;
	private boolean disponivel;
	

	public Revista(String nome, String formato, BigDecimal valor) {
		super(nome, formato, valor);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
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
	
	
}
