package practica_p4_3;

public class Clock {
	String time;
	
	void setTime(String t) {
		time=t;
	}  
	
	 String getTime() { // el retorno del metodo es un STRING por lo que la declaración del metodo como void (vacio) es incorrecto.
		return time;
	}
}

class ClockTestDrive{
	public static void main(String [] args) {
		Clock c = new Clock();
		
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}
}
