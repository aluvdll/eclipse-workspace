import javax.swing.JOptionPane;

public class Panel {
	public static void main(String[] args) {
		
		int valorX = 0;
		int valorIntroducido;
		System.out.println("imprime por consola");
		valorIntroducido = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu nombre", "Bienvenido ahora haz login", -1));
		
		System.out.println("el valor introducido en Jpanel es "+ valorIntroducido);
		JOptionPane.showConfirmDialog(null, "EL NUMERO INTRODUCIDO ES "+ valorIntroducido);
		JOptionPane.showInputDialog("este es el mensaje de InputDialog");
	}
	
}
