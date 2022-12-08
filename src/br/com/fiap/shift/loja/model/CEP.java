package br.com.fiap.shift.loja.model;
import javax.swing.JOptionPane;

public class CEP implements Validavel<String> {

	private String codigoDeEnderecamentoPostal;

	public CEP(String cep) {
		
		if (validar(cep)) {
			this.codigoDeEnderecamentoPostal = cep;
		} else {
			JOptionPane.showMessageDialog(null, "O CEP " + cep + " é inválido!");
			throw new RuntimeException("O CEP " + cep + " é inválido!");
		}

	}

	@Override
	public boolean validar(String t) {
		return t.matches("[0-9]{5}-[0-9]{3}");
	}

	@Override
	public String toString() {
		return codigoDeEnderecamentoPostal;
	}
}
