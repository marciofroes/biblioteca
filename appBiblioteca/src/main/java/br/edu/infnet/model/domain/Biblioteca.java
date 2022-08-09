package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Biblioteca {
	
	private String descricao;
	private LocalDateTime data;
	private boolean ativa;
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + isAtiva();
	}

}
