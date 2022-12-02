package practica_p1_6;

class ejercicio1_p1_6_3 {
	public static void main(String[] args) {
		int x = 0 ;
		int y = 0;
		while (x<5) {
			y = y + 2;
			if(y>4) {
					y = y -1;
				}
			
			System.out.print(x+""+y+" ");
			x=x+1;
		}
	}
}
