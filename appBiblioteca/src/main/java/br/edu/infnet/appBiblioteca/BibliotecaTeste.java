package br.edu.infnet.appBiblioteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Biblioteca;
import br.edu.infnet.model.domain.Jornal;
import br.edu.infnet.model.domain.Livro;
import br.edu.infnet.model.domain.Produto;
import br.edu.infnet.model.domain.Responsavel;
import br.edu.infnet.model.domain.Revista;
import br.edu.infnet.model.service.BibliotecaService;

@Component
public class BibliotecaTeste implements ApplicationRunner {

	@Autowired
	private BibliotecaService bibliotecaService;
	@Override
	public void run(ApplicationArguments args)  {
		System.out.println("#Biblioteca");
		
		Jornal j1 = new Jornal("O Futebol", "Fisico", 10,111);
		j1.setEdicaoEspecial(true); 
		j1.setEdicao("Fevereiro");
		j1.setTema("Campeonato Brasileiro");
		

		Jornal j2 = new Jornal("O Futebol", "Fisico", 10,111);
		j2.setEdicaoEspecial(true); 
		j2.setEdicao("Fevereiro");
		j2.setTema("Campeonato Brasileiro");
		

		Livro l1 = new Livro("Java Efetivo", "Digital", 50,222);
		l1.setAutor("Joshua Bloch");
		l1.setDisponivel(true);
		System.out.println(l1);
		
		Livro l2 = new Livro("Java Efetivo", "fisico", 50,1111);
		l2.setAutor("Joshua Bloch");
		l2.setDisponivel(true);
		System.out.println(l2);
		
		Revista r1 = new Revista("Fofacando", "Digital",10,333);
		r1.setTitulo("Artistas no flagra");
		r1.setEdicaoEspecial("Janeiro");
		r1.setDataPublicacao(new  Date());
		r1.setDisponivel(true);
		
		
		Set<Produto> listaProdutos1 = new HashSet<>();
		listaProdutos1.add(r1);
		listaProdutos1.add(l2);
		listaProdutos1.add(j2);
		listaProdutos1.add(l2);
		
		
		String dir = "C:\\projetos\\biblioteca\\";
		String arq = "biblioteca.txt";
		try {
				try {
					
					FileReader fileReader = new FileReader(dir+arq);
					BufferedReader leitura = new BufferedReader(fileReader);
					String linha = leitura.readLine();
					while (linha != null) {
						String[] campos= linha.split(";");
						Responsavel responsavel;
						try {
							responsavel = new Responsavel(campos[0], campos[1], campos[2]);
							Biblioteca biblioteca = new Biblioteca(responsavel);
							biblioteca.setAtiva(Boolean.valueOf(campos[3]));
							biblioteca.setDescricao(campos[4]);
							biblioteca.setProdutos(listaProdutos1);
							bibliotecaService.incluir(biblioteca);
							linha = leitura.readLine();
						} catch (Exception e) {
							e.getMessage();
						}
					}
					leitura.close();
					fileReader.close();
				} catch (IOException e) {
					System.out.println("[ERRO] Erro ao fechar/ler o arquivo!" );
				}
			} finally {
				System.out.println("Termino!");		}
	}

}
