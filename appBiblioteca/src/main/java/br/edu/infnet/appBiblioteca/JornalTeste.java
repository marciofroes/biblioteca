package br.edu.infnet.appBiblioteca;

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
		
		new AppBiblioteca("Inclusao do Jornal de Fevereiro").realtorio(j1);
		
		Jornal j2 = new Jornal("O Futebol", "Fisico", 10);
		j2.setEdicaoEspecial(true);
		j2.setEdicao("Março");
		j2.setTema("Campeonato Espanhol");;
		
		new AppBiblioteca("Inclusao do Jornal de Março").realtorio(j2);

		Jornal j3 = new Jornal("O Futebol", "Fisico", 10);
		j3.setEdicaoEspecial(true);
		j3.setEdicao("Abril");
		j3.setTema("Copa do Mundo");		
		
		new AppBiblioteca("Inclusao do Jornal Copa do Mundo").realtorio(j2);

	}

}
