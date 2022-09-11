package br.edu.infnet.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.test.AppImpressao;

@Service
public class UsuarioService {
	
	private static Map<String, Usuario> mapaUsuario = new HashMap<>();
	

	public void incluir(Usuario usuario) {
		mapaUsuario.put(usuario.getEmail(), usuario);
		AppImpressao.relatorio("Inclusao da usuario : " + usuario.getNome(), usuario);
	}
	
	public Collection<Usuario> obterLista(){
		return mapaUsuario.values();
	}
	

	public Usuario validarUsuario(String email, String pswd) {
		Usuario usuario = mapaUsuario.get(email);
		if (usuario != null && usuario.getSenha().equalsIgnoreCase(pswd)) {
			return usuario;
		}
		return null;
	}
	
	public void excluir(String emal) {
		mapaUsuario.remove(emal);
	}

}
