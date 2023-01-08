import javax.swing.JOptionPane;

public class CajonMaquina {
	private String nombreCajon;
	private int stockCajon;
	Refrescos  refresco[] = new Refrescos[10];
	
	public void setNombreCajon(String nombreCajon) {
		this.nombreCajon=nombreCajon;
	}
	
	public String getNombreCajon() {
		return nombreCajon;
	}

	public int getStockCajon() {
		return stockCajon;
	}

	public void setStockCajon() {
		int stockCajon = Integer.parseInt(JOptionPane.showInputDialog("Que cantidad de refresco quiere introducir"));
		this.stockCajon = this.stockCajon+stockCajon;
		int numRefresco = Integer.parseInt(JOptionPane.showInputDialog("Que Refresco (num) de refresco quiere introducir"));
		refresco[numRefresco]=new Refrescos();
	}
}
