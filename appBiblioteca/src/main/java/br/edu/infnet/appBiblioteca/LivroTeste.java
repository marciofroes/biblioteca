package br.edu.infnet.appBiblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Livro;
import br.edu.infnet.model.exceptions.ProdutoDescotinuadoException;
import br.edu.infnet.model.service.LivroService;

@Component
public class LivroTeste implements ApplicationRunner {
	@Autowired
	private LivroService livroService;
	
	@Override
	public void run(ApplicationArguments args) {
		System.out.println("#Livro");

		Livro l1 = new Livro("Programação", "Digital", 50, 111);
		l1.setTitulo("Java Efetivo");
		l1.setAutor("Joshua Bloch");
		l1.setDisponivel(true);
		l1.setDescontinuado(false);
		try {
			System.out.println("Calculo de emprestimo :" + l1.calcularEmprestimo());
			livroService.incluir(l1);
		} catch (ProdutoDescotinuadoException e) {
			System.out.println("[ERRO - LIVRO]" + e.getMessage());
		}

		Livro l2 = new Livro("Programação", "Fisico", 20, 1111);
		l2.setTitulo("Codigo Limpo");
		l2.setAutor("Martin");
		l2.setDisponivel(true);
		l2.setDescontinuado(false);
		try {
			System.out.println("Calculo de emprestimo :" + l2.calcularEmprestimo());
			livroService.incluir(l2);
		} catch (ProdutoDescotinuadoException e) {
			System.out.println("[ERRO - LIVRO]" + e.getMessage());
		}

		Livro l3 = new Livro("Programação", "Fisico", 120, 3333);
		l3.setTitulo("Java-OO");
		l3.setAutor("Prof. Elberth");
		l3.setDisponivel(true);
		l1.setDescontinuado(true);
		try {
			System.out.println("Calculo de emprestimo :" + l3.calcularEmprestimo());
			livroService.incluir(l3);
		} catch (ProdutoDescotinuadoException e) {
			System.out.println("[ERRO - LIVRO]" + e.getMessage());
		}

	}

}
