import javax.swing.JOptionPane;

public class testMaquinas {

	public static void main(String[] args) {
		
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
	
			int expElegido=Integer.parseInt(JOptionPane.showInputDialog("por favor elige el expendedor a utilizar"));
			expElegido-=1;
			
			JOptionPane.showMessageDialog(null, expendedor[expElegido].getnRef()+"que tiene un saldo de "+ expendedor[expElegido].getObtenSaldoMaquina()+"que tiene un stock de "+expendedor[expElegido].getConsultaStock(0));
	}
}
