import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		// Clean Code

		Computador dell = new Computador();

		dell.setDataDeFabricacao(LocalDate.now())
				.setEspacoHD(1000)
				.setMarca("Dell Vostro")
				.setModelo("Vostro")
				.setMemoriaRam(32)
				.setPlacaDeVideoDedicada(true)
				.setProcessador("i9").setPreco(7000);

		Fabricante fabricante = new Fabricante();
		fabricante.setNome("Dell Computadores da Amazonia");

		Endereco endereco = new Endereco("01015000");

		endereco.setBairro("Bela Vista");
		endereco.setLogradouro("Av. Paulista");
		endereco.setComplemento("Conj 100");
		endereco.setNumero("500");

		Pais br = new Pais();
		br.nome = "Brasil";

		Estado sp = new Estado();
		sp.pais = br;

		Cidade saoPaulo = new Cidade();
		saoPaulo.estado = sp;
		saoPaulo.nome = "São Paulo";

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

		// dell.calcularDesconto(10);

		System.out.println(dell);

	}

}
