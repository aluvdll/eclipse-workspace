import javax.swing.JOptionPane;

public class EjercicioOp12 {
	public static void main(String[] args) {
		double dividendo = Double.parseDouble(JOptionPane.showInputDialog("Inserta el dividendo"));
		double divisor = Double.parseDouble(JOptionPane.showInputDialog("Inserta el divisor"));
		division(dividendo, divisor);
	}
	
	static void division(double m, double v) {
		double totalDivision = m/v;
		System.out.println(totalDivision);//el resultado lo mostrará por consola.
	}
}
