package br.edu.infnet.appBiblioteca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	

	public static Usuario validarUsuario(String email, String pswd) {
		Usuario usuario = mapaUsuario.get(email);
		if (usuario != null && usuario.getSenha().equalsIgnoreCase(pswd)) {
			return usuario;
		}
		return null;
	}
	
	public static void excluir(String emal) {
		mapaUsuario.remove(emal);
	}
	
	

	@GetMapping(value = "/usuario/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem",obterLista());
		return "usuario/lista";
	}
	
	@GetMapping(value = "/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	
	
	@PostMapping(value = "/usuario/incluir")
	public String incluisao(Usuario usuario) {
		incluir(usuario);
		return "redirect:/";
	}
	
	@GetMapping(value = "/usuario/{email}/excluir")
	public String exclusao(@PathVariable String email) {
		excluir(email);
		return "redirect:usuario/lista";
	}
	
	
}
