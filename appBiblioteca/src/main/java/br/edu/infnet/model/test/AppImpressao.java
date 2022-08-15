package br.edu.infnet.model.test;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public  class AppImpressao {

	public  static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		
		printer.impressao();
	}
	
}
