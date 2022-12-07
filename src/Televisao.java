
public class Televisao {

	private boolean ligado;

	private int volume = 5;

	private int canal = 2;

	public void ligar() {
		ligado = true;
	}

	public void desligar() {
		ligado = false;
	}

	public void aumentarVolume() {
		volume = volume + 1;
	}

	public void diminuirVolume() {
		volume = volume - 1;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

}
