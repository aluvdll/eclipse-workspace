
public class Maquina {
	private int referencia;
	private double saldo;
	int[] stockCajon = new int[2];
	private int boton;
	
	Refrescos [] refresco = new Refrescos[1];
	
	
	public void setRefMaquina(int nRef) {
		referencia = nRef;
	}
	
	public int getnRef() {
		return referencia;
	}
	
	public void setInsertaSaldo(double nuevoSaldo) {
		saldo += nuevoSaldo;
	}
	
	public double getObtenSaldoMaquina() {
		return saldo;
	}
	

	public void setReponer(int reposicionStock, int cajon){
		stockCajon[cajon]+=reposicionStock;
	}
	
	public int getConsultaStock(int cajon) {
		return stockCajon[cajon];
	}
}