import javax.swing.JOptionPane;

public class EjercicioOp15 {
	public static void main(String [] args) {
		double tempIntroducida = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce los grados centígrados:", "Programa", -1));
		double gradosKelvin = 273.15 + tempIntroducida;
		double gradosFahrenheit = tempIntroducida * (9/5) + 32;
		
		JOptionPane.showConfirmDialog(null, "total: " + gradosKelvin, "Grados Kelvin",-1);
		JOptionPane.showConfirmDialog(null, "total: " + gradosFahrenheit, "Grados Fahrenheit",-1);
	}
}
