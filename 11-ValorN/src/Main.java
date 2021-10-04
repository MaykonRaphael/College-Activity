import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
//		Considere que o N será sempre maior que ZERO.

		int N, choice;
		
		do {
			N = setN();
			
			showValues(N);
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void showValues(int n) {
		String numbers = "";
		for( int i = 1; i <= n; i++ ) {
			numbers += i + ", ";
		}
		JOptionPane.showMessageDialog(null, numbers);
	}

	private static int setN() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite um valor maior que 0!"));
	}

}
