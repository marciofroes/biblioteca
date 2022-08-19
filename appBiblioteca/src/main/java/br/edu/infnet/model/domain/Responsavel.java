package br.edu.infnet.model.domain;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public class Responsavel implements IPrinter {

	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	
	public Responsavel(String cpf, String email, String nome) {
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + email;
	}

	@Override
	public void impressao() {
		System.out.println("#Responsavel");
		System.out.println(this);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
