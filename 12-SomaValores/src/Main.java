import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores
//		lidos (incluindo os valores lidos na soma). Considere que o segundo valor lido será
//		sempre maior que o primeiro valor lido.

		int value1, value2, choice;
		
		do {

			value1 = setValue1();
			do {
				value2 = setValue2();
				if( value2 < value1 ) { JOptionPane.showMessageDialog(null, "Digite um valor maior que " + value1); }
				
			} while( value2 < value1 );
			
			sum(value1, value2);
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void sum(int value1, int value2) {
		int sum = 0;
		for( int i = value1; i <= value2; i++) {
			sum += i;
		}
		
		JOptionPane.showMessageDialog(null, "Soma dos numeros: " + sum);
		
	}

	private static int setValue2() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor!"));
	}

	private static int setValue1() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor!"));
	}

}
