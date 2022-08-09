package br.edu.infnet.model.test;

import java.math.BigDecimal;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Jornal;


@Component
public class JornalTeste implements ApplicationRunner {

	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Jornal");
		
		Jornal j1 = new Jornal("O Futebol", "Fisico", new BigDecimal(10));
		j1.disponivel = true;
		j1.edicao = "Fevereiro";
		j1.tema = "Campeonato Brasileiro";
		
		System.out.println(j1);
		
		
		Jornal j2 = new Jornal("O Futebol", "Fisico", new BigDecimal(10));
		j2.disponivel = true;
		j2.edicao = "Março";
		j2.tema = "Campeonato Espanhol";
		
		System.out.println(j2);
		

		Jornal j3 = new Jornal("O Futebol", "Fisico", new BigDecimal(10));
		j3.disponivel = true;
		j3.edicao = "Abril";
		j3.tema = "Copa do Mundo";
		
		System.out.println(j3);
	}

}
