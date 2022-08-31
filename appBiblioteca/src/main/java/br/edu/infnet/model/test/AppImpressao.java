package br.edu.infnet.model.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;

public  class AppImpressao {

	public  static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		
		printer.impressao();
	}
	
	public static void main(String[] args) {
		String dir = "C:\\projetos\\biblioteca\\";
		String arq = "biblioteca.txt";
		
		try {
			try {
				try {
					FileReader fileReader = new FileReader(dir+arq);
					BufferedReader leitura = new BufferedReader(fileReader);
					String linha = leitura.readLine();
					while (linha != null) {
						System.out.println(linha);
						linha = leitura.readLine();
					}
				
					leitura.close();
					fileReader.close();
				} catch (FileNotFoundException e) {
					System.out.println("[ERRO] arquivo não encontrado!" );
				} catch (IOException e) {
					System.out.println("[ERRO] Erro ao fechar/ler o arquivo!" );
				}
			} finally {
				System.out.println("Termino!");		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
