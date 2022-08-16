package br.edu.infnet.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public class Biblioteca implements IPrinter {

	private String descricao;
	private LocalDateTime data;
	private boolean ativa;
	private Responsavel responsavel;
	private Set<Produto> produtos;


	public Biblioteca(Responsavel responsavel) {
		this.responsavel = responsavel;
		this.data = LocalDateTime.now();
		}

	@Override
	public String toString() {
		return "Descrição :" + descricao + ";" + "Data de criação :" + data + ";"+ "Ativa :" + isAtiva() +  "Responsavel :" + responsavel +  "Qtd de produtos :" + produtos.size();
	}

	@Override
	public void impressao() {
		System.out.println("#Biblioteca");
		System.out.println(this);

	}


	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
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

}
