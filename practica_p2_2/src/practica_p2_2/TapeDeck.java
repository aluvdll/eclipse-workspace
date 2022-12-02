package practica_p2_2;

class TapeDeck {
	boolean canRecord = false;
	void playTape(){
		System.out.println("tape playing");
	}
	
	void recordTape() {
		System.out.println("tape recording");
	}
}

class TapeDeckTestDrive{
	public static void main(String[] args) {
		
		TapeDeck t = new TapeDeck(); //en el ejercicio faltaba declarar el objeto.
		
		t.canRecord = true;
		t.playTape();
		
		if(t.canRecord == true) {
			t.recordTape();
		}
	}
}