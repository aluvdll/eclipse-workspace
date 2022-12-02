import javax.swing.JOptionPane;

public class EjercicioOp3 {
	public static void main(String[] args) {
		double precio = 85;
		double descuento = 15;
		double precioFinal =precio - (precio*(descuento/100));
		JOptionPane.showMessageDialog(null, "El precio total de un par de zapatos que cuesta " + precio + "€ y tiene un descuento del " + descuento + "% es: " + precioFinal+"€." );
	}
}
