package br.edu.infnet.model.exceptions;

public class ProdutoDescotinuadoException extends Exception {
	private static final long serialVersionUID = 1L;

	public ProdutoDescotinuadoException(String mensagem) {
		super(mensagem);
	}
}
