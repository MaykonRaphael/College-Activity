import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Escreva um algoritmo para ler o número total de eleitores de um município, o
//		número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada
//		um representa em relação ao total de eleitores.

		int totalVotes, whiteVotes, nullVotes, validVotes, choice;
		
		do {
			totalVotes = setTotalVotes();
			whiteVotes = setWhiteVotes();
			nullVotes = setNullVotes();
			validVotes = setValidVotes();
			
			whiteVotesPercentage(totalVotes, whiteVotes);
			nullVotesPercentage(totalVotes, nullVotes);
			validVotesPercentage(totalVotes, validVotes);

			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );
	}

	private static void whiteVotesPercentage(int totalVotes, int whiteVotes) {
		JOptionPane.showMessageDialog(null, ("Os votos em branco correspondem a: " + (whiteVotes*100)/totalVotes) + "%");
		
	}

	private static void nullVotesPercentage(int totalVotes, int nullVotes) {
		JOptionPane.showMessageDialog(null, ("Os votos em nulos correspondem a: " + (nullVotes*100)/totalVotes) + "%");
		
	}

	private static void validVotesPercentage(int totalVotes, int validVotes) {
		JOptionPane.showMessageDialog(null, ("Os votos validos correspondem a: " + (validVotes*100)/totalVotes) + "%");
		
	}

	private static int setTotalVotes() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o total de eleitores do seu município!"));
	}

	private static int setWhiteVotes() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos votos foram em branco!"));
	}

	private static int setNullVotes() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos votos foram nulos!"));
	}

	private static int setValidVotes() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos votos foram validos!"));
	}

}
