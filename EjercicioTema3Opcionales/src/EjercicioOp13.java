import javax.swing.JOptionPane;

public class EjercicioOp13 {
	public static void main(String[] args) {
		int segIntroducidos = Integer.parseInt(JOptionPane.showInputDialog("Inserta los segundos"));
		int segDia = 60*60*24;//86400seg
		int segHora = 60*60;//3600seg
		int minuto = 60;//60seg
		int totalDias, totalHoras, totalMinutos, totalSegundos;
		
		totalDias=segIntroducidos/segDia;
		
		totalHoras=(segIntroducidos%segDia)/segHora;
		
		totalMinutos = segIntroducidos-((totalDias*segDia)+(totalHoras*segHora));
		totalMinutos = totalMinutos/minuto;
		
		totalSegundos =segIntroducidos-((totalMinutos*60)+(totalDias*segDia)+(totalHoras*segHora));
	
				System.out.println(totalDias+" dia/s, "+ totalHoras+" hora/s, "+ totalMinutos + " minuto/s, "+ totalSegundos+ " segundo/s.");
	}
}
