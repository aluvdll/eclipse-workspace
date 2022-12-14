import javax.swing.JOptionPane;

public class Maquina {
	private int referencia;
	private double saldo;
	int cajones=10;
	int[] stockCajon = new int[2];
	private int boton;
	private int administrador = 2;//NO SE UTILIZA DE MOMENTO.
	private int contraseña = 1234;
	private int usuarios = 1;
	private int totalIntentosAcceso=4;
	private int intentoDeAccesos=0;
	
	CajonMaquina cj[] = new CajonMaquina[cajones];
	
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
	
	
	public int getConsultaStock(int cajon) {
		System.out.println("el stock existente en la máquina soliitada es de"+ stockCajon[cajon]);
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
					
					int opcionAdmin = Integer.parseInt(JOptionPane.showInputDialog(null, 
							"Pulsa 1 - Introducir stock "
							+ "\nPulsa 2 - Cambiar contraseña del expendedor "
							+ "\nPulsa 3 - Para modificar los intentos de acceso al menú administrador "
							+ "\nPulsa 4 - Para consultar el stock del cajón.",
						    "Menu Administrador", 0));
				switch (opcionAdmin) {
					case 1:
						int cajonRegStock = Integer.parseInt(JOptionPane.showInputDialog("Que cajón quiere rellenar ud"));
						cj[cajonRegStock].setStockCajon();
						break;
						
					case 2:
						setContraseña();
						break;
					
					case 3:
						setTotalIntentosAcceso();
						intentoDeAccesos=totalIntentosAcceso;
						break;	
						
					case 4:
						cajonRegStock = Integer.parseInt(JOptionPane.showInputDialog("Que cajón quiere consultar"));
						JOptionPane.showMessageDialog(null, "El cajón consultado tiene un total de "+cj[cajonRegStock].getStockCajon()+" latas.");
				}
					
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
			intentoDeAccesos=0;
		}
	}
}