package br.edu.infnet.model.domain;

import java.util.Objects;

import br.edu.infnet.appBiblioteca.interfaces.IPrinter;
import br.edu.infnet.model.exceptions.ProdutoDescotinuadoException;
import br.edu.infnet.model.exceptions.ProdutoIndisponivelException;

public abstract class Produto implements IPrinter {

	private Integer id;
	private String nome;
	private String formato;
	private float valor;
	private int codigo;
	private boolean disponivel;
	
	public Produto(String nome, String formato, float valor, int codigo) {
		super();
		this.nome = nome;
		this.formato = formato;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public abstract float calcularEmprestimo() throws ProdutoIndisponivelException, ProdutoDescotinuadoException;
	
	@Override
	public String toString() {
		return nome + " ; " + formato + " ; " + valor + " ; " + codigo;
	}
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getFormato() {
		return formato;
	}



	public void setFormato(String formato) {
		this.formato = formato;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	


}