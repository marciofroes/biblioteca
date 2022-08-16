package br.edu.infnet.appBiblioteca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.model.test.AppImpressao;
import br.edu.infnet.model.domain.Livro;


@Component
public class LivroTeste implements ApplicationRunner {

	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Livro");
		
		Livro l1 = new Livro("Java Efetivo", "Digital", 50, 111);
		l1.setAutor("Joshua Bloch");
		l1.setDisponivel(true);
		
		 AppImpressao.relatorio("Inclusao Livro Java Efetivo",l1);
		
		Livro l2 = new Livro("Codigo Limpo", "Fisico", 20, 1111);
		l2.setAutor("Martin");
		l2.setDisponivel(true);
		
		 AppImpressao.relatorio("Inclusao livro Codigo Limpo",l2);
		
		Livro l3 = new Livro("Java-OO", "Fisico", 120,3333);
		l3.setAutor("Prof. Elberth");
		l3.setDisponivel(true);
		
		 AppImpressao.relatorio("Inclusao livro Java-OO",l2);
		
		
	}

}
