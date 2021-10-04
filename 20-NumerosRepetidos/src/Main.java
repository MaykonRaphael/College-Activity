import javax.swing.JOptionPane;

public class Main {
	
	private final static int TAM = 50;

	public static void main(String[] args) {
//		Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e
//		escrever se existem números repetidos no vetor VET e em que posições se
//		encontram.
		
		int choice;
		double VET[] = new double[TAM];
		
		do {

			setVET(VET);
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );
		
		

	}

	private static void setVET(double[] vet) {
		for( int i = 0; i < TAM; i++ ) {
			vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor " + (i+1)));
		}
		
		verifyEqualNumbers(vet);
		
	}

	private static void verifyEqualNumbers(double[] vet) {
		int equal = 0, cont;
		for( int i = 0; i < TAM; i++ ) {
			cont = 0;
			for( int j = i+1; j < TAM; j++ ) {
				if( vet[i] == vet[j] ) {
					if( cont == 0 ) {
						JOptionPane.showMessageDialog(null, "O numero " + vet[i] + " foi repetido na posicao " + i + " e " + j);
					}
					cont++;
				}
			}
			equal += cont;
		}
		if( equal == 0 ) {
			JOptionPane.showMessageDialog(null, "Nao existem numeros repetidos!");
		}
		
	}

}
