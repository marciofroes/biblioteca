package br.edu.infnet.appBiblioteca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appBiblioteca.controller.ResponsavelController;
import br.edu.infnet.model.domain.Responsavel;


@Component
public class ResponsavelTeste implements ApplicationRunner {

	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Responsavel");
		
		Responsavel r1 = new Responsavel("11111111", "fulano@gmail.com", "Fulano da Silva");
		ResponsavelController.incluir(r1);
		Responsavel r2 = new Responsavel("11111111", "fulano@gmail.com", "Fulano da Silva");
		ResponsavelController.incluir(r2);
		Responsavel r3 = new Responsavel("11111111", "fulano@gmail.com", "Fulano da Silva");
		ResponsavelController.incluir(r3);

	}

}
