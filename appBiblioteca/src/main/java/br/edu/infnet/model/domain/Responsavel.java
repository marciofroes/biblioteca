package br.edu.infnet.model.domain;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public class Responsavel implements IPrinter {

	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	
	public Responsavel(String cpf, String email, String nome) throws Exception {
		if (cpf == null) {
			throw new Exception("Não é possível aceitar CPF nulo");
		}
		
		if (cpf.isEmpty()) {
			throw new Exception("Não é possível aceitar CPF sem preenchimento");
		}
		
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return getNome() + ";" + getCpf() + ";" + getEmail();
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

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}
	

}
