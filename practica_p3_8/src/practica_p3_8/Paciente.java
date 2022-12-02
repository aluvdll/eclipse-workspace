package practica_p3_8;

import javax.swing.JOptionPane;

class Paciente {
	String nombre;
	int edad;
	double kg;
	double m;
	double imc;
	int imctotal;
	String estado;
	
	public void obtenDatos(){
		nombre = JOptionPane.showInputDialog(null, "Inserta el nombre y apellidos", "Datos paciente:", -1);
		edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta la edad del paciente", "Datos paciente:", -1));
		kg = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserta los kg del paciente", "Datos paciente:", -1));
		m = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserta que mide el paciente. \nRecuerda que hay que insertar en metros", "Datos paciente:", -1));
		
	}
	
	
	 public double metodoCalcularIMC() {
		imc =  kg/(Math.pow(m,2));
		return imctotal = (int) imc;//con el parentesis le decimos que queremos sacar la parte entera del double lo que se denomina como hacer un cast (esto lo aprendí en un libro este verano).
	 }
	 

	
	public void mostrarDatos() {
		JOptionPane.showConfirmDialog(null, "El paciente " + nombre+ " tiene un imc de "+ metodoCalcularIMC()+"."+" El paciente "+nombre+" se clasifica como un estado "+ estadoIMC(), "Total calculo imc paciente", 1);	
	}
	
	
	public String estadoIMC() {
		
		if (imctotal<16) {
			estado = "Desnutrición grado 3 ";
		}else if (imctotal<17) {
			estado = "Desnutrición grado 2 ";
		}else if (imctotal<18.5) {
			estado = "Desnutrición grado 1 ";
		}else if (imctotal<25) {
			estado= " NORMAL ";
		}else if (imctotal<30) {
			estado = "Sobrepeso grado 1 ";
		}else if (imctotal<40) {
			estado = "Sobrepeso grado 2 ";
		}else{
			estado = "Sobrepeso grado 3 ";
		}
		return estado;
	}
}
