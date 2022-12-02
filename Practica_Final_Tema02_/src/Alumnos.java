import javax.swing.JOptionPane;

public class Alumnos {
	
	String nombre;
	int nota;
	
	void felicitar() {
		JOptionPane.showConfirmDialog(null, "Enorabuena has sacado un "+nota+".", "Mensaje de enhorabuena",-1);
	}; 
	
	void reprender() {

		JOptionPane.showConfirmDialog(null, "Tu nota ha sido un "+ nota +"\nNo has llegado al 5,\npero continua intentandolo,\ntu puedes hacerlo mejor.", "Mensaje de ánimo para seguir estudiando",-1);
	};
}
