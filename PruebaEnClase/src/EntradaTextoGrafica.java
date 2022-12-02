import javax.swing.JOptionPane;

public class EntradaTextoGrafica {

	public static void main (String[]args) {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		String bienvenida = "Bienvenid@"+nombre;
		JOptionPane.showMessageDialog(null, bienvenida);
		System.out.print(bienvenida);
	}
}
