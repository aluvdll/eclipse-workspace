import javax.swing.JOptionPane;

public class testCajero {
	
	public static void main(String[] args) {
		String saldo = "1";
		String Imposicion = "2";
		String reintegro = "3";
		String salir = "4";

		String opcionSelecionada = JOptionPane.showInputDialog(null, "Pulse 1, para consultar el saldo.\nPulse 2, para realizar un ingreso.\nPulse 3, para realizar un reintegro.\nPulse 4, Para salir.","Bienvenido - Selecione una operacion", -1);

		System.out.println(opcionSelecionada);
		
		do {

			if (opcionSelecionada == "1") {
			System.out.println("opcion 1");
			}
			else if (opcionSelecionada == "2") {
				System.out.println("opcion 2");

			}
			else if (opcionSelecionada == "3") {
				System.out.println("opcion 3");

			}
			else {
				JOptionPane.showMessageDialog(null, "ha introducido un valor no correcto", "Error", 0);
			}
		}while(opcionSelecionada != "4");
		JOptionPane.showMessageDialog(null, "Gracias, vuelve pronto.");
		
		}
}