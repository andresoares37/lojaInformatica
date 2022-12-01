import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		Computador dell = new Computador();

		dell.setDataDeFabricacao(LocalDate.now())
			.setEspacoHD(1000)
			.setMarca("Dell Vostro")
			.setModelo("Vostro 14253")
			.setMemoriaRam(32)
			.setPlacaDeVideoDedicada(true)
			.setProcessador("i9")
			.setPreco(7000);
		 

		Fabricante fabricante = new Fabricante();
		fabricante.nome = "Dell Computadores da Amazonia";

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

		fabricante.endereco = endereco;

		dell.setFabricante(fabricante);

		System.out.println(dell);

	}

}
