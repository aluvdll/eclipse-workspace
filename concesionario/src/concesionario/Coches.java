package concesionario;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JOptionPane;

public class Coches {
	private String nombre;
	private int ruedas;
	double largo, ancho;
	private String color;
	private boolean climatizado, manual, automatico;
	
	public Coches(){
		ruedas = 4;
		largo = 2.20;
		ancho = 1.80;
	}
	
	
	
	public void set_establece_color(String color_seleccionado) {
		color = color_seleccionado;
		
	}
	
	public String get_elcolordelcoche() {
		return color;
	}
	
	public void setSeleccionClimatizador(String Climatizado) {
		if(Climatizado.equalsIgnoreCase("si")) {
			climatizado = true;
		}else {
			climatizado = false;
		}
	}
	

	public String getSeleccionClimatizador() {
		if(getisClimatizado()) {
			String conClimatizado = "está climatizado";
			return conClimatizado;
		}else {
			String sinClimatizado = "no está climatizado";
			return sinClimatizado;
		}
		
	}

	public boolean getisClimatizado() {
		return climatizado;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}

class MisCoches{
	public static void main (String[]args) {
		Coches [] micoche = new Coches[5];
		micoche[0]= new Coches();
		micoche[1]= new Coches();
		micoche[2]= new Coches();
		micoche[3]= new Coches();
		micoche[4]= new Coches();
		boolean a = true;
		int opcion = 0;
		while(a) {
			
				try {

					opcion = Integer.parseInt(JOptionPane.showInputDialog("Inserta 1 para confirgurar vehiculo. \nInserta 2 para visualizar vehiculo. \nInserta 3 para salir."));

					switch(opcion) {
					case 1:
						int x = Integer.parseInt(JOptionPane.showInputDialog("Inserta el coche que quieres configurar"));
						x-=1;
						micoche[x].set_establece_color(JOptionPane.showInputDialog("inserta el color "));
						break;
					case 2:
						x = Integer.parseInt(JOptionPane.showInputDialog("Inserta el coche que quieres visualizar"));
						x-=1;
						System.out.println(micoche[x].get_elcolordelcoche());
						break;
					
					case 3:
						a= false;
						break;
						
					default:
						JOptionPane.showMessageDialog(null, "opcion introducida incorrecta","Error",0);
					}
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Introduzca un numero correcto", "Error",0);
				}
			}
	}
		
		/*
		Coches micoche1 = new Coches();
		System.out.println("El coche tiene un largo de " + micoche1.largo + "mts.");
		micoche1.set_establece_color(JOptionPane.showInputDialog("Establece el color"));
		System.out.println("El coche es de color " + micoche1.get_elcolordelcoche() + ".");
		micoche1.setSeleccionClimatizador("NO");
		System.out.println("El coche " + micoche1.getSeleccionClimatizador());
		System.out.println(micoche1.getisClimatizado());
		System.out.println("El ancho es " + micoche1.ancho +"y el largo es "+ micoche1.largo);
		*/
}

