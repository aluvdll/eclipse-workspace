
class afilaTuLapiz {
	
	int height;
	int width; 
	
	int calcArea(int height, int width) {
		return height * width;
	}


	public static void main(String[] args) {
		//int a = calcArea(7,12); -no compila
		//short c = 7;// -si que compila, declara una variable tipo primitiva short llamada c con un varo de 7;
		//calcArea(c,15); - no compila no respeta los tipos de datos.
		//int d = calcArea(57); - no respeta el argumento solo le pasa 1 al metodo y el metodo tiene 2 parametros.
		System.out.println(calcArea(2,3));

	}
}