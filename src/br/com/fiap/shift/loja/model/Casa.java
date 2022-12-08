package br.com.fiap.shift.loja.model;
import java.awt.Color;

public class Casa {

	String dono;

	static Color cor = Color.blue;

	public Casa(String dono) {
		this.dono = dono;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

 

	public static Color getCor() {
		return cor;
	}

	public static void setCor(Color cor) {
		Casa.cor = cor;
	}

	@Override
	public String toString() {
		return "Casa: " + dono + " COR: " + cor;
	}

}
