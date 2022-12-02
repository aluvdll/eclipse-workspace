import javax.swing.JOptionPane;

public class NotasDeLosAlumnos {
	public static void main(String[] args) {
		int numAlum =Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos alumnos tiene la clase?", "Ventana de selección de cantidad de alumnos", -1));
		int contador = 0;
		while(contador<numAlum) {
			Alumnos a = new Alumnos();
			a.nombre= JOptionPane.showInputDialog("Inserta el nombre del alumno");
			a.nota= Integer.parseInt(JOptionPane.showInputDialog("Inserta la nota del estudiante"));
			if(a.nota>=5) {
				a.felicitar();
			}
			else {
				a.reprender();
			}
			contador++;
			JOptionPane.showMessageDialog(null, "El alumno "+a.nombre+" ha sacado una nota de "+ a.nota, "Este es el resultado del alumno nº"+contador, 1);
			
		}
		JOptionPane.showMessageDialog(null, "Ya se han informado de todas las notas, en total se ha informado la nota de "+contador+"alumnos.","Mensaje de despedida", 2);

	}
}
