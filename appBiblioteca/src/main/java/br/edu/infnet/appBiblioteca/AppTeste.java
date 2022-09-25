package br.edu.infnet.appBiblioteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.app.Atributo;
import br.edu.infnet.model.domain.app.Classe;
import br.edu.infnet.model.domain.app.Projeto;

@Component
public class AppTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {

		String dir = "C:\\projetos\\biblioteca\\";
		String arq = "app.txt";
		
		try {
			try {

				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				String linha = leitura.readLine();
				
				List<Classe> classes = null;
				List<Atributo> atributos = null;
				Projeto projeto =  new Projeto();
				Classe classe = new Classe();
			
				while (linha != null) {
					try {
						
						String[] campos = linha.split(";");
						
						switch (campos[0].toUpperCase()) {
						case "P":
							System.out.println("Projeto");
							
							projeto.setNome(campos[1]);
							projeto.setDescricao(campos[2]);
							projeto.setClasse(classes);
							
							break;
						case "C":
							System.out.println("Classe");
							classe.setNome(campos[1]);
							classe.setAtributos(atributos);
							classes.add(classe);
							classe.impressao();
							break;
						case "A":
							System.out.println("Atritubo");
							Atributo atritubo = new Atributo(campos[1],campos[2],campos[3]);
							atributos.add(atritubo);
							atritubo.impressao();
						default:
							System.out.println("Opcao Invalida!!");
							break;
						}
						
						linha = leitura.readLine();
					} catch (Exception e) {
						e.getMessage();
					}
				}
				projeto.impressao();
				leitura.close();
				fileReader.close();
			} catch (IOException e) {
				System.out.println("[ERRO] Erro ao fechar/ler o arquivo!");
			}
		} finally {
			System.out.println("Termino!");
		}

		
	}
}