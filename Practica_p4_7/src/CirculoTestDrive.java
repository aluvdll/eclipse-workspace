import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CirculoTestDrive {

	 static double obtenDatos(){
		 
		double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserta el radio para el circulo que quieres calcular"));
		return radio;		
	}

	 static void muestraDatos(double radio, double area, double perimetro) {
		 DecimalFormat formato = new DecimalFormat("#,###.00");
		 JOptionPane.showMessageDialog(null, "El radio del circulo es "+ formato.format(radio) + ",\n el area del circulo es "+ formato.format(area)  + ",\n y el perimetro es " + formato.format(perimetro)+".");
	 }

	public static void main(String[] args) {
		boolean condicion = false;
		while(condicion == false) {
			Circulo c = new Circulo();
			try {
				c.setRadio(obtenDatos());
				muestraDatos(c.getRadio(),c.getArea(),c.getPerimetro());
				condicion = true;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Introduce un valor numerico");
			}
		}
	}
		

}
