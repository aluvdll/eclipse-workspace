package practica_Final_Tema02;

import javax.swing.JOptionPane;

public class Tema2Final {
	int num_alumnos;
	String nalumnos;
	int contador=0;
	Alumno introducido = new Alumno();
	
	nalumnos = JOptionPane.showInputDialog(null,"Introduce el numero de alumnos");
	System.out.println("El nº de alumnos en clase es:"+num_alumnos);
	while(contador<num_alumnos) {
		introducido.nombre=JOptionPane.showInputDialog(null, "Introduce el nombre del alumno")
		introducido.nota=Integer.parseInt(JOptionPane.showInputDialog(null, "Introudece la nota del alumno;"));
		
		if(introducido.nota>4) {
			introducido.felicitar();
		}
		else {
			introducido.reprender();
		}
		contador++;
	}
}
