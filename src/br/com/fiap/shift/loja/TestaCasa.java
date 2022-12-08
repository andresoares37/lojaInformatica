package br.com.fiap.shift.loja;

import javax.swing.JColorChooser;

import static java.lang.Math.*;

import br.com.fiap.shift.loja.model.*;

public class TestaCasa {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Casa lucas = new Casa("Lucas");

		Casa tiago = new Casa("Tiago");

		Casa phablo = new Casa("Phablo");

		phablo.setCor(JColorChooser.showDialog(null, "Escolher a cor", Casa.getCor()));

		double resultado = sqrt(9);

		System.out.println(resultado);

		System.out.println(lucas);
		System.out.println(tiago);
		System.out.println(phablo);

	}
}
