
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

}
