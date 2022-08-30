package br.edu.infnet.model.domain;

import br.edu.infnet.model.exceptions.ProdutoDescotinuadoException;

public class Livro extends Produto{


	private String autor;
	private String titulo;
	private boolean descontinuado;
	
	@Override
	public float calcularEmprestimo() throws ProdutoDescotinuadoException {
		if (isDescontinuado()) {
			throw new ProdutoDescotinuadoException("Este produto foi descontinuado!");
		}
		return getValor() + 2;
	}
	
	
	public Livro(String nome, String formato, float valor, int codigo) {
		super(nome, formato, valor, codigo);
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
	
	
	@Override
	public String toString() {
		return autor + ";" +  titulo + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#Livro");
		System.out.println(this);
		
	}


	public boolean isEdicaoEspecial() {
		return isDescontinuado();
	}


	public void setEdicaoEspecial(boolean edicaoEspecial) {
		this.setDescontinuado(edicaoEspecial);
	}


	public boolean isDescontinuado() {
		return descontinuado;
	}


	public void setDescontinuado(boolean descontinuado) {
		this.descontinuado = descontinuado;
	}


}
