package br.com.fiap.shift.loja.model;

public class Pais {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais(String nome) {
		this.nome = nome;
	}

	public Pais() {
	}

	public String toString() {
		return nome;
	}

}
