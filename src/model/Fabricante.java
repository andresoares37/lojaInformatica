package model;
public class Fabricante {

	private String nome;

	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Fabricante(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public Fabricante() { }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fabricante [nome=").append(nome).append(", endereco=").append(endereco).append("]");
		return builder.toString();
	}
	
	

}
