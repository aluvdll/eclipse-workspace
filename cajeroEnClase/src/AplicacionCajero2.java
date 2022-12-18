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
	
	void ingresar() {
		
		float ingreso= Float.parseFloat(JOptionPane.showInputDialog("cantidad que desea ingresar: "));
		float saldoActualizado=miCuenta.getSaldo()+ingreso;
		miCuenta.setSaldo(saldoActualizado);
	}
	
	void extraer () {
		float retirada= Float.parseFloat(JOptionPane.showInputDialog("cantidad que desea extraer: "));
		float saldoActualizado=miCuenta.getSaldo()-retirada;
		miCuenta.setSaldo(saldoActualizado);
		
	}
	void mostrarSaldo () {
		JOptionPane.showMessageDialog(null, "el saldo de la cuenta es: "+ miCuenta.getSaldo());
	}
	
}


public class AplicacionCajero2 {

	public static void main(String[] args) {
		
		Cajero cajeroInstituto = new Cajero();
		
		String opcion;
		boolean condicion=true;
		
		while(condicion) {
			opcion= JOptionPane.showInputDialog("1. Ingresar \n 2. Retirar\n 3. Consultar Saldo\n  4. Salir");
			try {
				switch (opcion) {
					case "1": {
						cajeroInstituto.ingresar();
						cajeroInstituto.mostrarSaldo();
						break;
					}
					case "2": { 
						cajeroInstituto.extraer();
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
				JOptionPane.showMessageDialog(null,ex);
			}
		}
				
	}
				
}
