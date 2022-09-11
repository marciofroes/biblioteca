package br.edu.infnet.appBiblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Jornal;
import br.edu.infnet.model.exceptions.ProdutoIndisponivelException;
import br.edu.infnet.model.service.JornalService;


@Component
public class JornalTeste implements ApplicationRunner {

	@Autowired
	private JornalService jornalService;
	
	@Override
	public void run(ApplicationArguments args)  {
		System.out.println("#Jornal");
		
		Jornal j1 = new Jornal("O Futebol Brasileirão", "Fisico", 10,111);
		j1.setEdicaoEspecial(true); 
		j1.setEdicao("Fevereiro");
		j1.setTema("Campeonato Brasileiro");
		j1.setDisponivel(true);
		try {
			System.out.println("Calculo de emprestimo : " + j1.calcularEmprestimo());
			jornalService.incluir(j1);
		} catch (ProdutoIndisponivelException e) {
			System.out.println("[ERROR - JORNAL] " + e.getMessage());
		}
		
		Jornal j2 = new Jornal("O Futebol Espanhol", "Fisico", 10,222);
		j2.setEdicaoEspecial(true);
		j2.setEdicao("Março");
		j2.setTema("Campeonato Espanhol");
		j2.setNome("Jornal dos Esportes");
		j2.setValor(5);
		j2.setFormato("Fisico");
		j2.setDisponivel(true);
		try {
			System.out.println("Calculo de emprestimo : " + j2.calcularEmprestimo());
			jornalService.incluir(j2);
		} catch (ProdutoIndisponivelException e) {
			System.out.println("[ERROR - JORNAL] " + e.getMessage());
		}
		
		Jornal j3 = new Jornal("O Futebol No Mundo ", "Fisico", 10,333);
		j3.setEdicaoEspecial(true);
		j3.setEdicao("Abril");
		j3.setTema("Copa do Mundo");	
		j3.setNome("Jornal dos Esportes");
		j3.setValor(5);
		j3.setFormato("Fisico");
		j3.setDisponivel(true);
		try {
			System.out.println("Calculo de emprestimo : " + j3.calcularEmprestimo());
			jornalService.incluir(j3);
		} catch (ProdutoIndisponivelException e) {
			System.out.println("[ERROR - JORNAL] " + e.getMessage());
		}

	}

}
