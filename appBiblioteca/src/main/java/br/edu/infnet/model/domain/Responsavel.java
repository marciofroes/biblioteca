package br.edu.infnet.model.domain;

public class Responsavel {

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
	
	public void impressao() {
		System.out.println("#Responsavel");
		System.out.println(this);
		
	}
	
}
