package practica_p2_2;

public class DVDPlayer {
	boolean canRecord = false;
	void recordDVD() {
		System.out.println("DVD recording");
	}
	//en el ejercicio lo que falta es declarar el metodo playDVD
	void playDVD() {
		System.out.println("DVD play");
	}
}

class DVDPlayerTestDrive{
	public static void main(String[] args) {
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		
		if (d.canRecord == true) {
			d.recordDVD();
		}
	}
}