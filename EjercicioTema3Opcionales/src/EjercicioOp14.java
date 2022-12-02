import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EjercicioOp14 {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Inserta el radio que quieras:"));
		double longitud = 2*Math.PI*radio;
		double area = Math.PI*Math.pow(radio, 2);//pi multiplicado por el radio al cuadrado (A = π r²)
		JOptionPane.showMessageDialog(null, "la longitud de la circunferencia es " + df.format(longitud) + ". "+ "el area de la circunferencia es " + df.format(area) + ".","Este es el resultado:", -1);
	}
}
