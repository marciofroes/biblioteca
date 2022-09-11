package br.edu.infnet.appBiblioteca;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Revista;
import br.edu.infnet.model.exceptions.ProdutoIndisponivelException;
import br.edu.infnet.model.service.RevistaService;


@Component
public class RevistaTeste implements ApplicationRunner {


@Autowired
private RevistaService revistaService;
	
	
	@Override
	public void run(ApplicationArguments args)  {
		System.out.println("#Revista");
		
		Revista r1 = new Revista("Fofacando", "Digital",10,1111);
		r1.setTitulo("Artistas no flagra");
		r1.setEdicaoEspecial("Janeiro");
		r1.setDataPublicacao(new  Date());
		r1.setDisponivel(true);
		try {
			System.out.println("Calculo de emprestimo : "+ r1.calcularEmprestimo());
			revistaService.incluir(r1);
		} catch (ProdutoIndisponivelException e) {
			System.out.println("[ERRO - REVISTA]" + e.getMessage());
		}
		
		Revista r2 = new Revista("Quatro Rodas", "Fisica", 14,2222);
		r2.setTitulo("Melhores 4x4");
		r2.setEdicaoEspecial("Abril");
		r2.setDataPublicacao(new  Date());
		r2.setDisponivel(true);
		try {
			System.out.println("Calculo de emprestimo : "+ r1.calcularEmprestimo());
			revistaService.incluir(r2);
		} catch (ProdutoIndisponivelException e) {
			System.out.println("[ERRO - REVISTA]" + e.getMessage());
		}
		
		Revista r3 = new Revista("A Política", "Fisica", 11,33333);
		r3.setTitulo("Eleições 2022");
		r3.setEdicaoEspecial("Agosto");
		r3.setDataPublicacao(new  Date());
		r3.setDisponivel(true);
		try {
			System.out.println("Calculo de emprestimo : "+ r1.calcularEmprestimo());
			revistaService.incluir(r3);
		} catch (ProdutoIndisponivelException e) {
			System.out.println("[ERRO - REVISTA]" + e.getMessage());
		}
		
		Revista r4 = new Revista("Duas Dodas", "Fisica", 11,33333);
		r4.setTitulo("Lanaçemtos 2022");
		r4.setEdicaoEspecial("Agosto");
		r4.setDataPublicacao(new  Date());
		r4.setDisponivel(false);
		try {
			System.out.println("Calculo de emprestimo : "+ r1.calcularEmprestimo());
			revistaService.incluir(r4);
		} catch (ProdutoIndisponivelException e) {
			System.out.println("[ERRO - REVISTA]" + e.getMessage());
		}
		
	}

}
