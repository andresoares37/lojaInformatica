import javax.swing.JColorChooser;

public class TestaCasa {

	public static void main(String[] args) {

		Casa lucas = new Casa("Lucas");

		Casa tiago = new Casa("Tiago");

		var phablo = new Casa("Phablo");

		phablo.setCor(JColorChooser.showDialog(null, "Escolher a cor", Casa.getCor()));

		System.out.println(lucas);
		System.out.println(tiago);
		System.out.println(phablo);

	}
}
