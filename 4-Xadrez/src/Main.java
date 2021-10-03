import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
//		inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
//		tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia
//		e terminar no dia seguinte.
		
		int startTime, endTime;
		
		do {
			startTime = setStartTime();
			showInvalidMessage(startTime);
			
		} while( startTime < 0 && startTime > 24 );
		
		endTime = setEndTime();
		
		calculateGameTime(startTime, endTime);

	}

	private static void calculateGameTime(int startTime, int endTime) {
		int gameTime = 0;
		
		if( endTime < startTime) {
			gameTime = 24 - Math.abs(endTime - startTime);
		} else {
			gameTime = endTime - startTime;
		}
		
		if( gameTime == 0 ) {
			gameTime = 24;
		}
		JOptionPane.showMessageDialog(null, "Tempo de jogo: " + gameTime + "h");
		
	}

	private static void showInvalidMessage(int startTime) {
		if( startTime < 0 && startTime > 24 ) {
			JOptionPane.showMessageDialog(null, "Informe um horario valido");
		}
		
	}

	private static int setStartTime() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio do jogo! ( de 0h à 23h )"));
	}

	private static int setEndTime() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de termino do jogo! ( de 0h à 23h )"));
	}

}
