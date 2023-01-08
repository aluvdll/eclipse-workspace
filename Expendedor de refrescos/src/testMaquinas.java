import javax.swing.JOptionPane;

public class testMaquinas {

	public static void main(String[] args) {
		
		Maquina [] expendedor = new Maquina[3];
		expendedor[0]= new Maquina();
		expendedor[0].cj[0]=new CajonMaquina();
		expendedor[0].cj[0].setNombreCajon("A1");
		expendedor[0].cj[1]=new CajonMaquina();
		expendedor[0].cj[1].setNombreCajon("A2");		
		
//		System.out.println(expendedor[0].cj[0].getStockCajon()+" "+expendedor[0].cj[0].getNombreCajon()+" "+expendedor[0].cj[0].refresco[0].getNombreRefresco());

		expendedor[1]= new Maquina();
		expendedor[1].setRefMaquina(1002);
		expendedor[1].setInsertaSaldo(200);
		expendedor[1].cj[0]=new CajonMaquina();
		expendedor[1].cj[0].setNombreCajon("A1");
		expendedor[1].cj[1]=new CajonMaquina();
		expendedor[1].cj[1].setNombreCajon("A2");	

		expendedor[2]= new Maquina();
		expendedor[2].setRefMaquina(1003);
		
		
		boolean inicioSesion= true;
		
		

		while(inicioSesion) {
			int expElegido=Integer.parseInt(JOptionPane.showInputDialog("por favor elige el expendedor a utilizar.\nActualmente hay "+expendedor.length+" máquinas."));
			expElegido-=1;

			
			expendedor[expElegido].accesoAExpendedor();
			System.out.println("este es el stock existente" + expendedor[0].cj[0].getStockCajon()+" Este es el nombre del cajón "+expendedor[0].cj[0].getNombreCajon());
			System.out.println("este es el stock existente" + expendedor[0].cj[1].getStockCajon()+" Este es el nombre del cajón "+expendedor[0].cj[1].getNombreCajon());
		}
	}
}

