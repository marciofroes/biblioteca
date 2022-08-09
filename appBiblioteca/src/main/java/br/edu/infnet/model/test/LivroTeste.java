package br.edu.infnet.model.test;

import java.math.BigDecimal;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Livro;


@Component
public class LivroTeste implements ApplicationRunner {

	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Livro");
		
		Livro l1 = new Livro("Java Efetivo", "Digital", new BigDecimal(50.5));
		l1.setAutor("Joshua Bloch");
		l1.setDisponivel(true);
		System.out.println(l1);
		
		Livro l2 = new Livro("Codigo Limpo", "Fisico", new BigDecimal(20.5));
		l2.setAutor("Martin");
		l2.setDisponivel(true);
		System.out.println(l2);
		
		Livro l3 = new Livro("Java-OO", "Fisico", new BigDecimal(120.5));
		l3.setAutor("Prof. Elberth");
		l3.setDisponivel(true);
		System.out.println(l3);
		
	}

}
