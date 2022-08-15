package br.edu.infnet.appBiblioteca;

import java.util.Date;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Revista;


@Component
public class RevistaTeste implements ApplicationRunner {

	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Revista");
		
		Revista r1 = new Revista("Fofacando", "Digital",10);
		r1.setTitulo("Artistas no flagra");
		r1.setEdicao("Janeiro");
		r1.setDataPublicacao(new  Date());
		r1.setDisponivel(true);
		
		new AppBiblioteca("Inclusao da revsita Fofocando").realtorio(r1);
		
		Revista r2 = new Revista("Quatro Rodas", "Fisica", 14);
		r2.setTitulo("Melhores 4x4");
		r2.setEdicao("Abril");
		r2.setDataPublicacao(new  Date());
		r2.setDisponivel(true);
		
		new AppBiblioteca("Inclusao da revsita Quatro Rodas").realtorio(r2);
		
		Revista r3 = new Revista("A Política", "Fisica", 11);
		r3.setTitulo("Eleições 2022");
		r3.setEdicao("Agosto");
		r3.setDataPublicacao(new  Date());
		r3.setDisponivel(true);
		
		new AppBiblioteca("Inclusao da revsita A Política").realtorio(r3);
	}

}
