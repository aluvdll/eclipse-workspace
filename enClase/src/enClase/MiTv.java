package enClase;

	class Television{
		String modelo;
		boolean encendida;
		int canal;
		int volumen;
		
		
		void encenderTv() {
			encendida=true;
			System.out.println("La tele "+ modelo + " está encencida.");
		}
		
		void apagarTV() {
			encendida=false;
			System.out.println("has apagdo la tele");
		}
	}
