import javax.swing.JOptionPane;

public class EjercicioOp11 {
public static void main(String[] args) {
	int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona el nº 1"));
	int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona el nº 2"));
	resta(n1,n2);
	
	
}
	static void resta (int n1, int n2) {
		int totalResta = n1 - n2;
		JOptionPane.showMessageDialog(null, "El resultado de la resta es "+ totalResta);
}
}
