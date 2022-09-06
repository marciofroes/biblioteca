package br.edu.infnet.appBiblioteca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appBiblioteca.controller.ResponsavelController;
import br.edu.infnet.appBiblioteca.controller.UsuarioController;
import br.edu.infnet.model.domain.Responsavel;
import br.edu.infnet.model.domain.Usuario;




@Component
public class UsuarioTeste implements ApplicationRunner {

	
	
	@Override
	public void run(ApplicationArguments args)  {
		System.out.println("#Usuario");
		Usuario usuario = new Usuario();
		usuario.setEmail("fulano@gmail.com");
		usuario.setSenha("123");
		usuario.setNome("Fulano da Silva");

		
		UsuarioController.incluir(usuario);
	}

}
