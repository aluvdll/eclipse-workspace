package miPrimerProyecto;

import java.util.Scanner;

public class miPrimeraAppp {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int num1, num2, x, i;
		i=0;
		System.out.println("quieres insertar un nuevo usuario, responde con un si o un no");
		String respUsuario = sc.next();
		String si = "si";
		if(respUsuario==si) {
			int n = 0; 
			System.out.println("Crea tu usuario con nombre y apellido");
			String usuario[][]= new String[n][n];
			usuario[n][n]=sc.next();
			
		}
		
		System.out.println("Inserta el primer numero");
		num1 = sc.nextInt();
		System.out.println("Inserta la segunda nota del alumno");
		num2 = sc.nextInt();
		
			if (num1==num2) {
				x = num1;
				System.out.println("los numeros son iguales");
			}
			
			else if (num1<num2) {
				x=num2;
					System.out.println(" el numero "+num2+"es el mayor");
				}
					
			
			else {
				x=num1;
					System.out.println("el numero + "+num1+ "es mayor");
			}		
			
			if(x>=5){
				System.out.println("aprobado");
			}
				else {System.out.print("suspendido");
				}
		
		while(x==6) {
			System.out.println("el resultado es 6");
			System.out.println("Escribe las veces que quieres saludar");
			int h = sc.nextInt();
			while(i<h) {
				System.out.println("SALUDO A MARTA");
				i++;
			}
		x++;
		}
	System.out.println("ahora tienes que introdir que dato quieres conocer");
	int a=sc.nextInt();
	
	String palabras[]=new String[] {"hola","adios"};
	
			
	System.out.println("Este es el dato que has solicitado ver " + palabras[a]);
	
	System.out.println("El jugador ");
	
	//String elNombre=usuario[0][0];
	System.out.println(elNombre);
	
	}
	
}


	


//compara dos numeros y imprime el numero mayor.