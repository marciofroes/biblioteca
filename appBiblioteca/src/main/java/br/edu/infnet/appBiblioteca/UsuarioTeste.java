package br.edu.infnet.appBiblioteca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Biblioteca;
import br.edu.infnet.model.domain.Responsavel;
import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.service.UsuarioService;

@Component
public class UsuarioTeste implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) {

		String dir = "C:\\projetos\\biblioteca\\";
		String arq = "usuario.txt";
		try {
			try {

				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				String linha = leitura.readLine();
				while (linha != null) {
					String[] campos = linha.split(";");
					Usuario usuario = new Usuario();
					try {
						usuario.setEmail(campos[0]);
						usuario.setSenha(campos[1]);
						usuario.setNome(campos[2]);
						usuarioService.incluir(usuario);
						linha = leitura.readLine();
					} catch (Exception e) {
						e.getMessage();
					}
				}
				leitura.close();
				fileReader.close();
			} catch (IOException e) {
				System.out.println("[ERRO] Erro ao fechar/ler o arquivo!");
			}
		} finally {
			System.out.println("Termino!");
		}
	}

}
