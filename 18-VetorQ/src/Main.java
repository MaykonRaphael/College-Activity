import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a seguir
//		o valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor.
		
		int choice;
		int arrayQ[] = new int[5];
		
		do {

			for( int i = 0; i < arrayQ.length; i++ ) {
				do {
					arrayQ[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor " + (i+1)));
				}while( arrayQ[i] < 0);
			}
			
			biggerNumber(arrayQ);
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void biggerNumber(int[] arrayQ) {
		int bigger = 0, position = 0;
		for( int i = 0; i < arrayQ.length; i++ ) {
			if( arrayQ[i] > bigger ) {
				bigger = arrayQ[i];
				position = i + 1;
			}
		}
		JOptionPane.showMessageDialog(null, "O maior numero do vetor é " + bigger + " e esta na posição " + position);
		
	}

}
