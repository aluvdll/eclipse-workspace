package Prueba2;

import javax.swing.JOptionPane;

public class Cajero {
	
	Cuenta miCuenta = new Cuenta();
	
	double solicitarCantidad() {
		double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, " Teclea la cantidad que deseas","IMPORTE",-1));
		return cantidad;
	}
	
	void ingresa() {
		try {
			double cantidad = solicitarCantidad();	
			double nuevoSaldo = cantidad + miCuenta.getSaldo();
			miCuenta.setSaldo(nuevoSaldo);
			JOptionPane.showMessageDialog(null, "Se ha realizado un ingreso de "+ cantidad + "€.", "Resumen de ingreso", -1);
	
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Por favor introduce un valor correcto para poder realizar el ingreso", "Error", 0);
		}
	}
	void obtenerSaldo() {
		JOptionPane.showMessageDialog(null,"El saldo actual de tu cuenta es "+miCuenta.getSaldo()+"€.","Consulta de saldo",1);	
	}

	void extraer() {
		try {
			double cantidad = solicitarCantidad();
			double nuevoSaldo = miCuenta.getSaldo()-cantidad;
			miCuenta.setSaldo(nuevoSaldo);
			JOptionPane.showMessageDialog(null, "Se ha realizado una retirada de saldo de  "+ cantidad + "€.", "Resumen de retirada de saldo", -1);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Por favor introduce un valor correcto para poder realizar la retirada de saldo", "Error", 0);
		}
	}
	
}

