package br.edu.infnet.model.domain;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public class Responsavel implements IPrinter {

	public String nome;
	public String cpf;
	public String email;
	
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
	

}
