import javax.swing.JOptionPane;
//comentario para prueba git
public class testCajero {
	
	public static void main(String[] args) {
		int saldo = 1;
		int Imposicion = 2;
		int reintegro = 3;
		int salir = 4;

		int opcionSelecionada = Integer.parseInt(JOptionPane.showInputDialog(null, "Pulse 1, para consultar el saldo.\nPulse 2, para realizar un ingreso.\nPulse 3, para realizar un reintegro.\nPulse 4, Para salir.","Bienvenido - Selecione una operacion", -1));

		System.out.println(opcionSelecionada);
		
		while(opcionSelecionada!=salir) {

			if (opcionSelecionada == saldo) {
			System.out.println("opcion 1");
			solicitaCantidad();
			}
			else if (opcionSelecionada == Imposicion) {
				System.out.println("opcion 2");

			}
			else if (opcionSelecionada == reintegro) {
				System.out.println("opcion 3");

			}

			else {
				JOptionPane.showMessageDialog(null, "ha introducido un valor no correcto", "Error", 0);
			}
			opcionSelecionada = Integer.parseInt(JOptionPane.showInputDialog(null, "Pulse 1, para consultar el saldo.\nPulse 2, para realizar un ingreso.\nPulse 3, para realizar un reintegro.\nPulse 4, Para salir.","Bienvenido - Selecione una operacion", -1));


	
		}
	}
	static void solicitaCantidad() {
		System.out.println("funcion solicitaCantidad()");
		
	}
}


