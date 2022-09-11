package br.edu.infnet.appBiblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Responsavel;
import br.edu.infnet.model.service.ResponsavelService;




@Component
public class ResponsavelTeste implements ApplicationRunner {

	@Autowired
	private ResponsavelService responsavelService;
	
	@Override
	public void run(ApplicationArguments args)  {
		System.out.println("#Responsavel");
		
		try {
			Responsavel responsavel= new Responsavel("11111111", "ciclano@gmail.com", "Ciclano da Silva");
			responsavelService.incluir(responsavel);
		} catch (Exception e) {
			System.out.println("Deu ruim");
			System.out.println("[ERROR]" + e.getMessage());
		}
		
		try {
			Responsavel r2= new Responsavel("1111111111", "fulano@gmail.com", "Fulano da Silva");
			responsavelService.incluir(r2);
		} catch (Exception e) {
			System.out.println("Deu ruim");
			System.out.println("[ERROR]" + e.getMessage());
		}
		
		try {
			Responsavel r3= new Responsavel("2222222222", "fulano@gmail.com", "Fulano da Silva");
			responsavelService.incluir(r3);
		} catch (Exception e) {
			System.out.println("Deu ruim");
			System.out.println("[ERROR]" + e.getMessage());
		}
		
		try {
			Responsavel r4 = new Responsavel(null, "beltrano@gmail.com", "Beltrano da Silva");
			responsavelService.incluir(r4);
		} catch (Exception e) {
			System.out.println("[ERROR]" + e.getMessage());
		}
		try {
			Responsavel r5= new Responsavel("", "chico@gmail.com", "francisco da Silva");
			responsavelService.incluir(r5);
		} catch (Exception e) {
			System.out.println("[ERROR]" + e.getMessage());
		}

	}

}
