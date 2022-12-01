public class Endereco {

	private String logradouro;

	private String numero;

	private String complemento;

	private String bairro;

	private String codigoDeEnderecamentoPostal;

	private Cidade cidade;

	public String getCep() {
		return codigoDeEnderecamentoPostal;
	}

	public void setCep(String cep) {
		this.codigoDeEnderecamentoPostal = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCodigoDeEnderecamentoPostal() {
		return codigoDeEnderecamentoPostal;
	}

	public void setCodigoDeEnderecamentoPostal(String codigoDeEnderecamentoPostal) {
		this.codigoDeEnderecamentoPostal = codigoDeEnderecamentoPostal;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Endereco() {

	}

	public Endereco(String cep) {
		this.codigoDeEnderecamentoPostal = cep;
	}

}
