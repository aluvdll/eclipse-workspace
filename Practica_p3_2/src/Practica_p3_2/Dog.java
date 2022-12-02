package Practica_p3_2;

public class Dog {
	String name;
	public static void main(String[] args) {
		//creamos el objeto Dog y accedemos a él
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name ="Bart";
		
		//ahora creamos el array de Dog
		Dog[] myDogs = new Dog[3];
		
		// y ponemos algunos Dog en él
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//ahora accederemos a los objetos
		//usando el array de referencias
		
		myDogs[0].name ="Fred";
		myDogs[1].name ="Marge";
		
		//...¿cuál es el nombre de myDogs[2]?
		System.out.println("last dog´s name is");
		System.out.println(myDogs[2].name);
		
		//recorremos el array y les decimos
		//a los perros (Dog) que ladren (bark)
		
		int x = 0;
		while(x<myDogs.length) {
			myDogs[x].bark();
			x = x +1 ;
		}
	}
	
	public void bark() {
		System.out.println(name + " says Ruff!");
	}
	
	public void eat() {
		
	}
	
	public void chaseCat() {
		
	}

}

