package model;
import java.time.LocalDate;

public class Computador implements Persistivel {

	private Long id;

	private String modelo;

	private String marca;

	private Fabricante fabricante;

	private LocalDate dataDeFabricacao;

	private double preco;

	private int memoriaRam;

	private int espacoHD;

	private String processador;

	private boolean placaDeVideoDedicada;

	public Computador() {

	}

	public Computador(String modelo, String marca, Fabricante fabricante, LocalDate dataDeFabricacao, double preco,
			int memoriaRam, int espacoHD, String processador, boolean placaDeVideoDedicada) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.fabricante = fabricante;
		this.dataDeFabricacao = dataDeFabricacao;
		this.preco = preco;
		this.memoriaRam = memoriaRam;
		this.espacoHD = espacoHD;
		this.processador = processador;
		this.placaDeVideoDedicada = placaDeVideoDedicada;
	}

	public void calcularDesconto(double aliquota) {
		this.preco = preco - (preco * aliquota / 100);
	}

	public boolean adicionarMemoriaRam(int quantidade) {
		if (quantidade % 2 == 1)
			return false;
		memoriaRam += quantidade;
		preco += quantidade * 150;
		return true;
	}

	public String getModelo() {
		return modelo;
	}

	public Computador setModelo(String modelo) {
		this.modelo = "DELL " + modelo.toUpperCase();
		return this;
	}

	public String getMarca() {
		return marca;
	}

	public Computador setMarca(String marca) {
		this.marca = marca;
		return this;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public Computador setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
		return this;
	}

	public LocalDate getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public Computador setDataDeFabricacao(LocalDate dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
		return this;
	}

	public double getPreco() {
		return preco;
	}

	public Computador setPreco(double preco) {
		this.preco = preco;
		return this;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public Computador setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
		return this;
	}

	public int getEspacoHD() {
		return espacoHD;
	}

	public Computador setEspacoHD(int espacoHD) {
		this.espacoHD = espacoHD;
		return this;
	}

	public String getProcessador() {
		return processador;
	}

	public Computador setProcessador(String processador) {
		this.processador = processador;
		return this;
	}

	public boolean isPlacaDeVideoDedicada() {
		return placaDeVideoDedicada;
	}

	public Computador setPlacaDeVideoDedicada(boolean placaDeVideoDedicada) {
		this.placaDeVideoDedicada = placaDeVideoDedicada;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador [modelo=").append(modelo).append(", marca=").append(marca).append(", fabricante=")
				.append(fabricante).append(", dataDeFabricacao=").append(dataDeFabricacao).append(", preco=")
				.append(preco).append(", memoriaRam=").append(memoriaRam).append(", espacoHD=").append(espacoHD)
				.append(", processador=").append(processador).append(", placaDeVideoDedicada=")
				.append(placaDeVideoDedicada).append("]");
		return builder.toString();
	}

	@Override
	public Persistivel cadastrar(Persistivel p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persistivel consultarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persistivel alterar(Persistivel p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean excluir(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public long getId() {
		return id;
	}

	public Computador setId(Long id) {
		this.id = id;
		return this;
	}

}
