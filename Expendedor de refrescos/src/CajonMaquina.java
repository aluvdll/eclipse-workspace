
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

	public void setStockCajon(int stockCajon, String NombreRefrescoReponer, int numRefresco) {
		this.stockCajon = stockCajon;
		refresco[numRefresco]=new Refrescos();
		refresco[numRefresco].setInsertaNombreProducto(NombreRefrescoReponer);
	}
	
	
}
