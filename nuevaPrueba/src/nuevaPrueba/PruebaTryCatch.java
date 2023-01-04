package nuevaPrueba;

import javax.swing.*;

public class PruebaTryCatch {
	public static void main (String[]args) {
		int solicitarNumero = 0;
		boolean condicion = true;
		do {
			try {
				solicitarNumero =  Integer.parseInt(JOptionPane.showInputDialog(null,"Inserta el numero", "solicitud", -1));
				condicion=true;
				JOptionPane.showMessageDialog(null, "el valor introducido es " + solicitarNumero);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "se ha producidio un error de "+ e);
				condicion = false;
				
			}
			
		}while(condicion==false);
	}
}
