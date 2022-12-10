import javax.swing.JOptionPane;
//comentario para prueba git
public class testCajero {
	 
	static double solicitaCantidad() {
		return Double.parseDouble(JOptionPane.showInputDialog(null,"Por favor introduzca una cantidad","MENU SOLICITUD DE CANTIDAD",-1));
	}
	
	static double obtenerSaldo() {
		Cuenta c = new Cuenta();
		System.out.println(" este es el saldo dentro de la funcion obtener saldo " + c.getSaldo());
		return c.getSaldo();
		
	}
		
	static void ingresar() {
		double impSelec = solicitaCantidad();
		Cuenta c = new Cuenta();
		double importe = c.getSaldo()+impSelec;
		c.setSaldo(importe);
		
		//return nuevoSaldo;
	}
	
	 void retirarSaldo() {
			double variable = solicitaCantidad();
			Cuenta c = new Cuenta();
			
			//return nuevoSaldo;
		}
	 
	 
	public static void main(String[] args) {

		int saldo = 1;
		int Imposicion = 2;
		int reintegro = 3;
		int salir = 4;
		
		
		
		Cuenta c = new Cuenta();
				
		int opcionSelecionada = Integer.parseInt(JOptionPane.showInputDialog(null, "Pulse 1, para consultar el saldo.\nPulse 2, para realizar un ingreso.\nPulse 3, para realizar un reintegro.\nPulse 4, Para salir.","Bienvenido - Selecione una operacion", -1));
	
		while(opcionSelecionada!=salir) {

			if (opcionSelecionada == saldo) {
				double saldoActual = c.getSaldo();
				JOptionPane.showMessageDialog(null, "El saldo actual de su cuenta es "+ saldoActual +"€", "Consulta de saldo", -1);
			}
			else if (opcionSelecionada == Imposicion) {
				ingresar();
				JOptionPane.showMessageDialog(null, "Ha realizado un ingreso de €", "Confirmación de ingreso", -1);
			}
			else if (opcionSelecionada == reintegro) {
				System.out.println("opcion 3");
				double retirada = solicitaCantidad();
				c.setSaldo(retirada);
				JOptionPane.showMessageDialog(null, "Ha realizado un ingreso de " + retirada + "€", "Confirmación de ingreso", -1);
				

			}

			else {
				JOptionPane.showMessageDialog(null, "ha introducido un valor no correcto", "Error", 0);
			}
			opcionSelecionada = Integer.parseInt(JOptionPane.showInputDialog(null, "Pulse 1, para consultar el saldo.\nPulse 2, para realizar un ingreso.\nPulse 3, para realizar un reintegro.\nPulse 4, Para salir.","Bienvenido - Selecione una operacion", -1));

		}
	}
		
}


