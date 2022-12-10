package Prueba2;

import javax.swing.JOptionPane;

public class testsCajero {
	public static void main(String [] args) {
		
		Cajero elCajero = new Cajero();
		boolean condicion = false;
		
		while ( condicion == false) {
			String opcion = JOptionPane.showInputDialog(null, "1. Consultar saldo \n2. Retirar saldo\n3. Ingresar \n4. Salir", "Seleccione una acción", -1);

			switch (opcion) {
				case "1":{
					elCajero.obtenerSaldo();
					break;
				}
				
				case "2":{
					elCajero.extraer();
					break;
				}
				
				case "3":{
					elCajero.ingresa();
					break;
				}
				
				case"4":{
					
					condicion = true;
					
					break;
				}
				default:{
					JOptionPane.showMessageDialog(null, "Por favor pulse una de las opciones validas", "Error",0);
				}
			}
			
		}
		JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios.");
	}
}
