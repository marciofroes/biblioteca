package br.edu.infnet.model.exceptions;

public class ProdutoIndisponivelException extends Exception {
	private static final long serialVersionUID = 1L;

	public ProdutoIndisponivelException(String mensagem) {
		super(mensagem);
	}
}
