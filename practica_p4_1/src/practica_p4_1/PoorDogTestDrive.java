package practica_p4_1;

public class PoorDogTestDrive {

	public static void main(String[] args) {
		PoorDog one = new PoorDog();
		System.out.println("Dog size is: " + one.getSize());// si que compila pero al no inicializar la variable con un dato se le asigna el valor por defecto de java.
		System.out.println("Dog name is: " + one.getName());// si que compila pero al no inicializar la variable con un dato se le asigna el valor por defecto de java.
	}
}

