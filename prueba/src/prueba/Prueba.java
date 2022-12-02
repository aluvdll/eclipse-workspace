package prueba;

class Dog{
	String nombre;
	String raza;
	
}

public class Prueba {
public static void main(String[] args) {

	Dog [] pets = new Dog[7];
	pets [0] = new Dog();
	pets [1] = new Dog();
	pets [2] = new Dog();
	pets [3] = pets [2];
	System.out.println(pets[3]);
	System.out.println(pets[2]);
}
}
