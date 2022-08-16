package br.edu.infnet.appBiblioteca;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Biblioteca;
import br.edu.infnet.model.domain.Jornal;
import br.edu.infnet.model.domain.Livro;
import br.edu.infnet.model.domain.Produto;
import br.edu.infnet.model.domain.Responsavel;
import br.edu.infnet.model.domain.Revista;
import br.edu.infnet.model.test.AppImpressao;

@Component
public class BibliotecaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
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
		r1.setEdicao("Janeiro");
		r1.setDataPublicacao(new  Date());
		r1.setDisponivel(true);
		
		
		Set<Produto> listaProdutos1 = new HashSet<>();
		listaProdutos1.add(r1);
		listaProdutos1.add(l2);
		listaProdutos1.add(j2);
		listaProdutos1.add(l2);
		
		Responsavel responsavel1 = new Responsavel("111111111111", "teste@gamil.com", "Joao");
		Responsavel responsavel2 = new Responsavel("222222222222", "blablba@gamil.com", "Pedro");
		Responsavel responsavel3 = new Responsavel("333333333333", "fulano@gamil.com", "Fulano");
		
		Biblioteca b1 = new Biblioteca(responsavel1);
		b1.setAtiva(true);
		b1.setDescricao("Biblioteca de variedades");
		b1.setProdutos(listaProdutos1);
		
		AppImpressao.relatorio("Biblioteca :", b1);
		
		Set<Produto> listaProdutos2 = new HashSet<>();
		listaProdutos2.add(r1);
		listaProdutos2.add(l2);
		
		Biblioteca b2 = new Biblioteca(responsavel2);
		b2.setAtiva(true);
		b2.setDescricao("Biblioteca online");
		b2.setProdutos(listaProdutos2);
		
		AppImpressao.relatorio("Biblioteca :", b2);
		
		Biblioteca b3 = new Biblioteca(responsavel3);
		b3.setAtiva(true);
		b3.setDescricao("Biblioteca de esportes");
		b3.setProdutos(listaProdutos1);
		
		AppImpressao.relatorio("Biblioteca :", b3);
		
		
		
		
		
	}

}
