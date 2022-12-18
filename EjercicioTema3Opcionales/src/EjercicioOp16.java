import javax.swing.JOptionPane;

public class EjercicioOp16 {
	public static void main(String[] args) {
		
		double euros = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el valor en €:"));
		double valorLibra = 0.8606;
		double totalEnLibras = euros * valorLibra;
		double valorDolar = 1.05;
		double totalEnDolares = euros * valorDolar;
		
		JOptionPane.showMessageDialog(null, "EL VALOR DE "+euros+" Euros, es igual a, "+totalEnLibras+" libras, y equivale a "+ totalEnDolares + "$.");
	}
}
