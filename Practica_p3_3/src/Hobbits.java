//El ejercicio si que compila pero pienso que se podria mejorar con mis comentarios
public class Hobbits {
	String name;
	
	public static void main(String[] args) {
		
		Hobbits [] h = new Hobbits[3]; // yo crearia un espacio de 2 memorios por los cometarios que pongo despues
		int z = 0;
		
		while (z<4) {//YO PONDRIA z<2 o z<h.length si fuera de 2 espacios (tablas...vectores) el array
			z=z+1; //con esta variable nunca crearemos el objeto en el vector [0] ya que se inicializa con un 1.
			h[z]=new Hobbits();
			h[z].name="bilbo"; //se crea el h[1].name con nombre de bilbo, al espacio de h[0] no se le ha asignado ningún objeto. 
			if(z==1) {
				h[z].name="frodo"; //con esta assignacion a la variable se le elimina el nombre de bilbo y se le asigna frodo.
			}
			if(z==2) {
				h[z].name="sam";
			}
			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name");
		}
	}
}