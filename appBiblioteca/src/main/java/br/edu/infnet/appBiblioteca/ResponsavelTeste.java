package br.edu.infnet.appBiblioteca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appBiblioteca.controller.ResponsavelController;
import br.edu.infnet.model.domain.Responsavel;




@Component
public class ResponsavelTeste implements ApplicationRunner {

	
	
	@Override
	public void run(ApplicationArguments args)  {
		System.out.println("#Responsavel");
		
		try {
			Responsavel responsavel= new Responsavel("11111111", "ciclano@gmail.com", "Ciclano da Silva");
			ResponsavelController.incluir(responsavel);
		} catch (Exception e) {
			System.out.println("Deu ruim");
			System.out.println("[ERROR]" + e.getMessage());
		}
		
		try {
			Responsavel r2= new Responsavel("1111111111", "fulano@gmail.com", "Fulano da Silva");
			ResponsavelController.incluir(r2);
		} catch (Exception e) {
			System.out.println("Deu ruim");
			System.out.println("[ERROR]" + e.getMessage());
		}
		
		try {
			Responsavel r3= new Responsavel("2222222222", "fulano@gmail.com", "Fulano da Silva");
			ResponsavelController.incluir(r3);
		} catch (Exception e) {
			System.out.println("Deu ruim");
			System.out.println("[ERROR]" + e.getMessage());
		}
		
		try {
			Responsavel r4 = new Responsavel(null, "beltrano@gmail.com", "Beltrano da Silva");
			ResponsavelController.incluir(r4);
		} catch (Exception e) {
			System.out.println("[ERROR]" + e.getMessage());
		}
		try {
			Responsavel r5= new Responsavel("", "chico@gmail.com", "francisco da Silva");
			ResponsavelController.incluir(r5);
		} catch (Exception e) {
			System.out.println("[ERROR]" + e.getMessage());
		}

	}

}
