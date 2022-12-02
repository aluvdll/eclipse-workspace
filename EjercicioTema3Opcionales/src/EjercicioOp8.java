import javax.swing.JOptionPane;

public class EjercicioOp8 {
	public static void main(String[] args) {
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Que edad tienes?"));
		int totalDias = edad*365;
		JOptionPane.showMessageDialog(null, "Estos son los dias que tienes " + totalDias + ".");
	}
}
