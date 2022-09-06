package br.edu.infnet.model.domain;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public class Usuario implements IPrinter {

	private String nome;
	private String senha;
	private String email;
	
	

	@Override
	public void impressao() {
		System.out.println("#Usuario");
		System.out.println(this);
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
