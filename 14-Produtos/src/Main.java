import java.util.Arrays;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
//		Faça um algoritmo para ler o código e o preço de 15 produtos, calcular e escrever: - o
//		maior preço lido - a média aritmética dos preços dos produtos
		
		int id[] = new int[15], choice;
		double price[] = new double[15], avarege = 0;
		
		do {
			for( int i = 0; i < 15; i++ ) {
				id[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto " + (i+1)));
				price[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + (i+1)));
				avarege += price[i];
			}
			
			calculePriceAndAvarage(id, price, avarege);
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void calculePriceAndAvarage(int[] id, double[] price, double avarege) {
		Arrays.sort(price);
		JOptionPane.showMessageDialog(null, "Maior preço lido foi R$" + price[price.length-1]);
		JOptionPane.showMessageDialog(null, "A média aritimética dos preços é: R$" + (avarege / 15));
		
	}

}
