import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o
//		percentual de reajuste. Calcular e escrever o valor do novo sal�rio.

		int choice;
		double wage;
		
		do {
			wage = setWage();
			calculateNewWage(wage);

			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );
	}

	private static void calculateNewWage(double wage) {
		JOptionPane.showMessageDialog(null, "Seu sal�rio com 10% de reajuste �: R$" + (wage * 0.1 + wage));
	}

	private static double setWage() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite seu sal�rio atual!"));
	}

}
