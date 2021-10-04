import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio
//		fixo por m�s, mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do
//		valor das vendas por ele efetuadas. Escrever um algoritmo que leia o n�mero de
//		carros por ele vendidos, o valor total de suas vendas, o sal�rio fixo e o valor que ele
//		recebe por carro vendido. Calcule e escreva o sal�rio final do vendedor.

		int soldCars, choice;
		double wage, commission, totalSold;
		
		do {
			wage = setWage();
			commission = setCommission();
			soldCars = setSoldCars();
			totalSold = setTotalSold();
			
			commission /= 100;
			
			totalWage(wage, commission, soldCars, totalSold);
	
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void totalWage(double wage, double commission, int soldCars, double totalSold) {
		JOptionPane.showMessageDialog(null, "Este � seu sal�rio final!" + (wage + (commission * soldCars) + (totalSold * 0.05)));
		
	}

	private static int setSoldCars() {
		return Integer.parseInt(JOptionPane.showInputDialog("Quantos carros voc� vendeu?"));
	}

	private static double setTotalSold() {
		return Double.parseDouble(JOptionPane.showInputDialog("Qual foi o valor total de suas vendas?"));
	}

	private static double setWage() {
		return Double.parseDouble(JOptionPane.showInputDialog("Qual seu sal�rio?"));
	}

	private static double setCommission() {
		return Double.parseDouble(JOptionPane.showInputDialog("Quanto � sua comiss�o por carro vendido?"
															+ "\nDigite apenas o numero da porcentagem!"));
	}

}
