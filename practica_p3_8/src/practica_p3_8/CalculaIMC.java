package practica_p3_8;

import javax.swing.JOptionPane;

public class CalculaIMC {
	
	public static void main(String[] args) {	
		int nPacientes = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert el nº. de pacientes.", "Calcular IMC", -1));
		Paciente totalPacientes []= new Paciente[nPacientes];
	
		int contador = 0;		
		while(contador<totalPacientes.length) {
		
			totalPacientes[contador]= new Paciente();
			totalPacientes[contador].obtenDatos();
			totalPacientes[contador].mostrarDatos();
			contador++;
			
		}
		contador=0;
		
		double totalKg = 0;
		
		while(contador<totalPacientes.length) {
			totalKg = totalPacientes[contador].kg+totalKg;
			contador++;
		}
		contador=0;
		
		double totalm = 0;
		
		while(contador<totalPacientes.length) {
			totalm = totalPacientes[contador].m+totalm;
			contador++;
		}
		contador=0;
		
		int edadMax = totalPacientes[contador].edad;
		int edadMin = totalPacientes[contador].edad;
		while (contador<totalPacientes.length) {
			if (edadMax<totalPacientes[contador].edad) {
				edadMax=totalPacientes[contador].edad;
			}
			if (edadMin>totalPacientes[contador].edad) {
				edadMin=totalPacientes[contador].edad;
			}
			contador++;
		}
		
		
		
		JOptionPane.showConfirmDialog(null, "La media de kg del total de pacientes consultados es "+totalKg/nPacientes+"."+
											"\nLa media de estatura, del total de pacientes consultados es "+totalm/nPacientes+
											"\nLa máxima edad que se ha analizado, del total de pacientes consultados es "+ edadMax +
											"\nLa mínima edad que se ha analizado, del total de pacientes consultados es "+ edadMin);

	}
}


