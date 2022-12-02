import javax.swing.JOptionPane;

public class Persona {//creamos la clase Persona
	String nombre;
	String NIF;
	String dni;
	int resto;

	void obtenDatos(){
		nombre = JOptionPane.showInputDialog(null, "solicita el nombre");
		dni = JOptionPane.showInputDialog(null, "solicita el dni");
	}

	void muetraDatos(){.
		resto = Integer.parseInt(dni)%23;
		char [] tablaLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		NIF = dni + "-" + tablaLetra[resto];
		JOptionPane.showMessageDialog(null, nombre +" tiene el NIF " + NIF, "Documentación solicitada", 1);// creo el titulo de la ventana y el icono así como el resultado a mostrar.
	}
	
}

