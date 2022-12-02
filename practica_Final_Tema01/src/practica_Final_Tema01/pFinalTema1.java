package practica_Final_Tema01;

public class pFinalTema1 {
	public static void main(String[]args) {
		System.out.println("Primeros 25 enteros:");
		int x = 1;
		while(x<=25) {
			System.out.print(x);
			if (x<25) {
				System.out.print(", ");
			}
			x++;
		}
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("Los primeros pares hasta el 50:");
		x=2;
		while(x<=50) {
			System.out.print(x);
				if(x<50) {
				System.out.print(", ");
				}
				x=x+2;
		}
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("Los primeros impares hasta el 49:");
		x=1;	
		while(x<=49) {
			System.out.print(x);
				if(x<49) {
				System.out.print(", ");
				}
				x=x+2;
		}
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("TABLAS DE MULTIPLICAR");
		System.out.println("-------------------------------");

		
		for(x=1; x<=10; x++) {
			System.out.println("Esta es la tabla del "+x+":");
				for(int i=1; i<=10; i++) {
					int c = x*i;
					System.out.println(x+"*"+i+"="+c);
				}
			System.out.println("----------");
		
		}
		
	}
}


















