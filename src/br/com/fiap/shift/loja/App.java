package br.com.fiap.shift.loja;

import java.time.LocalDate;

import br.com.fiap.shift.loja.model.Cidade;
import br.com.fiap.shift.loja.model.Computador;
import br.com.fiap.shift.loja.model.Endereco;
import br.com.fiap.shift.loja.model.Estado;
import br.com.fiap.shift.loja.model.Fabricante;
import br.com.fiap.shift.loja.model.Pais;

public class App {

	public static void main(String[] args) {

		Computador dell = new Computador();

		dell.setDataDeFabricacao(LocalDate.now()).setEspacoHD(1000).setMarca("Dell Vostro").setModelo("Vostro")
				.setMemoriaRam(32).setPlacaDeVideoDedicada(true).setProcessador("i9").setPreco(7000);

		Fabricante fabricante = new Fabricante();
		fabricante.setNome("Dell Computadores da Amazonia");

		Endereco endereco = new Endereco("01015000");

		endereco.setBairro("Bela Vista");
		endereco.setLogradouro("Av. Paulista");
		endereco.setComplemento("Conj 100");
		endereco.setNumero("500");

		Pais br = new Pais("Brasil");

		Estado sp = new Estado();
		sp.setPais(br);

		Cidade saoPaulo = new Cidade();
		saoPaulo.setEstado(sp);
		saoPaulo.setNome("São Paulo");

		fabricante.setEndereco(endereco);

		dell.setFabricante(fabricante);

		boolean sucesso = dell.adicionarMemoriaRam(16);

		if (sucesso) {
			System.out.println("Memoria RAM adicionada com sucesso!");
			System.out.println("Memoria: " + dell.getMemoriaRam());
			System.out.println("Novo valor: " + dell.getPreco());
		} else {
			System.out.println("Não foi possível adicionar a quantidade de memória informada");
		}

		dell.calcularDesconto(10);

		System.out.println(dell);

	}

}
