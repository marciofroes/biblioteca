package br.edu.infnet.appBiblioteca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.model.test.AppImpressao;
import br.edu.infnet.appBiblioteca.controller.LivroController;
import br.edu.infnet.model.domain.Livro;


@Component
public class LivroTeste implements ApplicationRunner {

	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Livro");
		
		Livro l1 = new Livro("Programação", "Digital", 50, 111);
		l1.setTitulo("Java Efetivo");
		l1.setAutor("Joshua Bloch");
		l1.setDisponivel(true);
		
		LivroController.incluir(l1);
		
		Livro l2 = new Livro("Programação", "Fisico", 20, 1111);
		l2.setTitulo("Codigo Limpo");
		l2.setAutor("Martin");
		l2.setDisponivel(true);
		
		LivroController.incluir(l2);
		
		Livro l3 = new Livro("Programação", "Fisico", 120,3333);
		l3.setTitulo("Java-OO");
		l3.setAutor("Prof. Elberth");
		l3.setDisponivel(true);
		
		LivroController.incluir(l3);
		
	}

}
