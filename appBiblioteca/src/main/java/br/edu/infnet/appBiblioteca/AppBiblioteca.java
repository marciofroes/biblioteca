package br.edu.infnet.appBiblioteca;

import br.edu.infnet.model.domain.Produto;

public class AppBiblioteca {

	private  String mensagem;
	
	public AppBiblioteca(String mensagem) {
		this.mensagem = mensagem;
	}
	public  void realtorio(Produto produto) {
		System.out.println(mensagem);
		produto.impressao();
	}
}
