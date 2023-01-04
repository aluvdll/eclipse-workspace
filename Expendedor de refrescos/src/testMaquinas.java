import javax.swing.JOptionPane;

public class testMaquinas {

	public static void main(String[] args) {
		int administrador = 2;
		int contraseña = 1234;
		int usuarios = 1;
		int totalIntentosAcceso=4;
		int intentoDeAccesos=0;
		
		Maquina [] expendedor = new Maquina[3];
			expendedor[0]= new Maquina();
			expendedor[0].setRefMaquina(1001);
			expendedor[0].setInsertaSaldo(100);
			expendedor[0].setReponer(0, 0);
			
	
			expendedor[1]= new Maquina();
			expendedor[1].setRefMaquina(1002);
			expendedor[1].setInsertaSaldo(200);
			
			expendedor[2]= new Maquina();
			expendedor[2].setRefMaquina(1003);
			
			int tipoUsuario= Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer,\nPulsa 1 - Comprar \nPulsa2 - Para administrar la máquina"));
			if(tipoUsuario==usuarios) {
				System.out.println("está en el if de usuarios");
// A PARTIR DE AQUÍ OPCIONES DE ADMINISTRADOR
			}else {
				System.out.println("está en el else de administrador");
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
//			int expElegido=Integer.parseInt(JOptionPane.showInputDialog("por favor elige el expendedor a utilizar"));
//			expElegido-=1;
//			
//			JOptionPane.showMessageDialog(null, expendedor[expElegido].getnRef()+"que tiene un saldo de "+ expendedor[expElegido].getObtenSaldoMaquina()+"que tiene un stock de "+expendedor[expElegido].getConsultaStock(0));
			}
	}
}
