package br.edu.infnet.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Jornal;


@Component
public class JornalTeste implements ApplicationRunner {

	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Jornal");
		
		Jornal j1 = new Jornal("O Futebol", "Fisico", 10);
		j1.setEdicaoEspecial(true); 
		j1.setEdicao("Fevereiro");
		j1.setTema("Campeonato Brasileiro");
		
		System.out.println(j1);
		
		
		Jornal j2 = new Jornal("O Futebol", "Fisico", 10);
		j2.setEdicaoEspecial(true);
		j2.setEdicao("Março");
		j2.setTema("Campeonato Espanhol");;
		
		System.out.println(j2);
		

		Jornal j3 = new Jornal("O Futebol", "Fisico", 10);
		j3.setEdicaoEspecial(true);
		j3.setEdicao("Abril");
		j3.setTema("Copa do Mundo");		
		System.out.println(j3);
	}

}