
class Circulo {
	private double radio;
	
	public void setRadio(double nuevoRadio) {
		radio = nuevoRadio;
	}
	
	public double getRadio() {		
		return radio;
	}
	
	public double getArea(){
		double area = Math.PI*Math.pow(radio, 2);
		return area;
	}
	
	public double getPerimetro() {
		double perimetro = 2 * Math.PI*radio;
		return perimetro;
	}
	
}