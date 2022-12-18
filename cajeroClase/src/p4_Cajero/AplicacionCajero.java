package p4_Cajero;

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
	
	Cuenta miCuenta = new Cuenta();

	static float obtenerCantidad() {
		float cantidad = Float.parseFloat(JOptionPane.showInputDialog("Introduce la cantidad: "));
		return cantidad;
	}
	
	void ingresar(float ingreso) {
		float saldoActualizado=miCuenta.getSaldo()+ingreso;
		miCuenta.setSaldo(saldoActualizado);
	}
	
	void extraer (float retirada) {
		float saldoActualizado=miCuenta.getSaldo()-retirada;
		miCuenta.setSaldo(saldoActualizado);
		
	}
	void mostrarSaldo () {
		JOptionPane.showMessageDialog(null, "el saldo de la cuenta es: "+ miCuenta.getSaldo());
	}
	
}


public class AplicacionCajero {

	public static void main(String[] args) {
		
		Cajero cajeroInstituto = new Cajero();
		
		String opcion;
		boolean condicion=true;
		float valor;
		
		while(condicion) {
		
			opcion= JOptionPane.showInputDialog("1. Ingresar \n2. Retirar\n3. Consultar Saldo\n4. Salir");
			
			try {
				switch (opcion) {
					case "1": {
						valor = Cajero.obtenerCantidad();
						cajeroInstituto.ingresar(valor);// se puede poner directamente dentro del parentesis el metodo cajeroInstituto.obtenerCantidad()
						cajeroInstituto.mostrarSaldo();
						break;
					}
					case "2": { 
						valor = Cajero.obtenerCantidad();
						cajeroInstituto.extraer(valor);// se puede poner directamente dentro del parentesis el metodo cajeroInstituto.obtenerCantidad()
						cajeroInstituto.mostrarSaldo();
						break;
					}
					case "3": {
						cajeroInstituto.mostrarSaldo();
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
