import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO,
//		deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor
//		zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
//		(utilizar a estrutura REPITA).
		
		int choice;
		double value1, value2;
		
		do {
			value1 = setValue1();
			
			do {
				value2 = setValue2();
				if( value2 == 0 ) {
					JOptionPane.showMessageDialog(null, "Digite um numero valido!");
				}
			} while( value2 == 0 );
			
			JOptionPane.showMessageDialog(null, "Resultato da divisao: " + (value1 / value2));
	
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );


	}

	private static double setValue1() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor!"));
	}

	private static double setValue2() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor!"));
	}

}
