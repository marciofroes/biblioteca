package br.edu.infnet.model.domain;

public class Livro extends Produto{


	private String autor;
	private String titulo;
	private boolean disponivel;
	
	
	public Livro(String nome, String formato, float valor) {
		super(nome, formato, valor);
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	@Override
	public String toString() {
		return autor + ";" +  titulo + ";" + disponivel + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#Livro");
		System.out.println(this);
		
	}
}
