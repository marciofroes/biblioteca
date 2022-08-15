package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public class Biblioteca implements IPrinter{
	
	private String descricao;
	private LocalDateTime data;
	private boolean ativa;
	private Produto produto;
	private Responsavel responsavel;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + isAtiva();
	}

	@Override
	public void impressao() {
		System.out.println("#Biblioteca");
		System.out.println(this);
		
	}

}
