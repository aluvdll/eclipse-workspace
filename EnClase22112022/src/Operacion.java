
class Operacion {
	int sumar(int a, int b, int c) {
		int resultado;
		resultado= a+b+c;
		return resultado;
	}
	public class AppOperacion{
		public static void main(String[] args) {
			int x = 2;
			int y = 4;
			int z = 8;
			int resultado;
			
			Operacion ejemplo = new Operacion();
			resultado = ejemplo.sumar(x, y, z);
			System.out.println(resultado);
		};
		
	}
}


