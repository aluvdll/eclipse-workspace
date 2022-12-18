import javax.swing.JOptionPane;

public class EjercicioOp17 {
	public static void main(String[] args) {
		//PRIMERA VEZ PRECIO, PAGO, Y KM.
		//SEGUNDA VEZ PRECIO, PAGO.
		//TERCERA VEZ KM.
		
		double km[]= new double[3];
		double pago[] = new double[3];
		double precioLitro[] = new double[3];
		km[0]=Double.parseDouble(JOptionPane.showInputDialog(null, "Inserta los km del cuenta km, de la primera vez"));
		pago[0] = Double.parseDouble(JOptionPane.showInputDialog(null, " Pago 1 es:"));
		precioLitro[0] = Double.parseDouble(JOptionPane.showInputDialog(null, " PRECIO litro 1:"));
		pago[1] = Double.parseDouble(JOptionPane.showInputDialog(null, " Pago 2 es:"));
		precioLitro[1] = Double.parseDouble(JOptionPane.showInputDialog(null, " PRECIO litro 2:"));
		km[2]=Double.parseDouble(JOptionPane.showInputDialog(null, "Inserta los km del cuenta km, de la tercera vez"));
		
		//cálculo los km totales realizados.
		
		double kmTotalesRealizados = 0; 
		for(int x=0; x<km.length; x++) {
			kmTotalesRealizados = km[x];
		}
		kmTotalesRealizados=kmTotalesRealizados-km[0];

		
		//cálculo el precio medio de la gasolina.
		double mediaPrecioLitro = 0;
		for (int x=0; x<precioLitro.length; x++) {
			mediaPrecioLitro = mediaPrecioLitro+precioLitro[x];
		};
		mediaPrecioLitro=mediaPrecioLitro/2;
		
		
		//cálculo el total pagado.
		double pagosTotales = 0;
		for (int x=0; x<pago.length; x++) {
			pagosTotales= pagosTotales+pago[x];			
		}

		double valor1km = pagosTotales/kmTotalesRealizados;
		System.out.println("este es el coste de 1 km" + valor1km+"euros.");
		
		//cálculo total de litros de gasolina
		double totalLitros;
		totalLitros = pago[0]/precioLitro[0];
		totalLitros = totalLitros+(pago[1]/precioLitro[1]);
		
		
		
		double consumoCada100 = (totalLitros/kmTotalesRealizados)*100;
		System.out.println("El consumo por cada 100km es"+ consumoCada100+"euros");
		
	}
	
}
