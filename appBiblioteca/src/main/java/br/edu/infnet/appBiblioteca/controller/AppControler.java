package br.edu.infnet.appBiblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.model.domain.Usuario;

@Controller
public class AppControler {

	@GetMapping(value = "/")
	public String telaHome() {
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String pswd) {
		Usuario usuario = UsuarioController.validarUsuario(email, pswd);
		
		if (usuario != null ) {
			model.addAttribute("user", usuario.getNome());
			return "home" ;
		}
		return "login";
	}
	
	@GetMapping(value ="/logout" )
	public String logout(Model model) {
		model.addAttribute("user", "");
		return "redirect:/";
	}
}
