package br.edu.infnet.appBiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.test.AppImpressao;

@Controller
public class UsuarioController {
	
	private static Map<String, Usuario> mapaUsuario = new HashMap<>();
	

	public static void incluir(Usuario usuario) {
		mapaUsuario.put(usuario.getEmail(), usuario);
		AppImpressao.relatorio("Inclusao da usuario : " + usuario.getNome(), usuario);
	}
	
	public Collection<Usuario> obterLista(){
		return mapaUsuario.values();
	}
	

	@GetMapping(value = "/usuario/lista")
	public String telaLista() {
		return "usuario/lista";
	}
	
}
