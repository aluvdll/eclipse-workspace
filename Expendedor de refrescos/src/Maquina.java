import javax.swing.JOptionPane;

public class Maquina {
	private int referencia;
	private double saldo;
	int[] stockCajon = new int[2];
	private int boton;
	private int administrador = 2;//NO SE UTILIZA DE MOMENTO.
	private int contraseña = 1234;
	private int usuarios = 1;
	private int totalIntentosAcceso=4;
	private int intentoDeAccesos=0;
	
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

	public int getContraseñaActual() {
		return contraseña;
	}

	public void setContraseña() {
		int compruebaContraseñaAntigua = Integer.parseInt(JOptionPane.showInputDialog("nul","Inserta la contraseña actual"));
		if(compruebaContraseñaAntigua==contraseña) {
			int nuevaContraseña = Integer.parseInt(JOptionPane.showInputDialog("nul","Inserta la nueva contraseña."));
			contraseña=nuevaContraseña;
		}
	}

	public int getTotalIntentosAcceso() {
		return totalIntentosAcceso;
	}
	public void setTotalIntentosAcceso(){
		int totalnuevosIntentosAcceso = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta el nuevo numero de intentos de acceso al menú administrador", "Cambio de intentos de acceso al menú", 0));
		totalIntentosAcceso = totalnuevosIntentosAcceso;
	}
	
	public void accesoAExpendedor() {

		int tipoUsuario= Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer,\nPulsa 1 - Comprar \nPulsa2 - Para administrar la máquina"));
		if(tipoUsuario==usuarios) {
			System.out.println("está en el if de usuarios");
			//A PARTIR DE AQUÍ OPCIONES DE ADMINISTRADOR
		}else {
			while (intentoDeAccesos<totalIntentosAcceso) {
				int constraseñaIntroducida= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la contraseña"));

				if(constraseñaIntroducida==contraseña) {
					System.out.println("está en el menu de administrador");
					intentoDeAccesos=totalIntentosAcceso;
				}else {
					++intentoDeAccesos;
					if(intentoDeAccesos==totalIntentosAcceso) {
						JOptionPane.showMessageDialog(null, "SISTEMA BLOQUEADO\n Contacte con el proveedor", "ERROR",0);					
					}else if (intentoDeAccesos==totalIntentosAcceso-1) {
						JOptionPane.showMessageDialog(null, "ULTIMO INTENTO", "ERROR",0);
					}
					else {
						JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA\nRecuerde que solo dispone de " + (totalIntentosAcceso-intentoDeAccesos) + " intentos más.", "ERROR",0);						
					}
				}
			}
		}
	}
}