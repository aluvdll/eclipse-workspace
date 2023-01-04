package CajerosArray;

import javax.swing.JOptionPane;

class Cuenta{
	private float saldo;
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float nuevoSaldo) {
		saldo= nuevoSaldo;
	}
}
	
class Cajero{
	
	Cuenta miCuenta[] = new Cuenta[3];

	static float obtenerCantidad() {
		float cantidad = Float.parseFloat(JOptionPane.showInputDialog("Introduce la cantidad: "));
		return cantidad;
	}
	
	void ingresar(int numCuenta, float ingreso) {
		float saldoActualizado=miCuenta[numCuenta].getSaldo()+ingreso;
		miCuenta[numCuenta].setSaldo(saldoActualizado);
	}
	
	void extraer (int numCuenta, float retirada) {
		float saldoActualizado=miCuenta[numCuenta].getSaldo()-retirada;
		miCuenta[numCuenta].setSaldo(saldoActualizado);
		
	}
	void mostrarSaldo (int numCuenta) {
		JOptionPane.showMessageDialog(null, "el saldo de la cuenta es: "+ miCuenta[numCuenta].getSaldo());
	}
	
}


public class AplicacionCajero {
	public static void main(String[] args) {
		
		Cajero cajeroInstituto = new Cajero();
		cajeroInstituto.miCuenta[0] =new Cuenta();
		cajeroInstituto.miCuenta[1] = new Cuenta();
		cajeroInstituto.miCuenta[2] = new Cuenta();
		
		String opcion;
		int opcionCuenta;
		boolean condicion=true;
		float valor;
		
		while(condicion) {
			
			opcionCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona cuenta:\n 1-Personal. \n 2-Cuenta de ahorro. \n3-Cuenta compartida. \n4-Salir"));
			System.out.println("esta es el nº de array seleccionado" +  (opcionCuenta-1));
			opcion= JOptionPane.showInputDialog("1. Ingresar \n2. Retirar\n3. Consultar Saldo\n4. Salir");
			
			try {
				switch (opcion) {
					case "1": {
						valor = Cajero.obtenerCantidad();
						System.out.println(opcionCuenta-1+","+valor);
						cajeroInstituto.ingresar(opcionCuenta-1, valor);// se puede poner directamente dentro del parentesis el metodo cajeroInstituto.obtenerCantidad()
						cajeroInstituto.mostrarSaldo(opcionCuenta-1);
						break;
					}
					case "2": { 
						valor = Cajero.obtenerCantidad();
						cajeroInstituto.extraer(opcionCuenta-1, valor);// se puede poner directamente dentro del parentesis el metodo cajeroInstituto.obtenerCantidad()
						cajeroInstituto.mostrarSaldo(opcionCuenta-1);
						break;
					}
					case "3": {
						cajeroInstituto.mostrarSaldo(opcionCuenta-1);
						break;
					}
					case "4": {
						JOptionPane.showMessageDialog(null, "muchas gracias por utilizar nuestros servicios");
						condicion=false;
						break;
					}
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "por favor introduce un valor númerico");
				//JOptionPane.showMessageDialog(null,ex); está linea está comentada para solo es para explicar que se puede llamar al nombre que se le asigne a Exception
			}
		}
				
	}
				
}
