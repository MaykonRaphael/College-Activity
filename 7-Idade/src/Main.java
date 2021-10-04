import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que
//		as idades dos homens serão sempre diferentes entre si, bem como as das mulheres).
//		Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
//		e o produto das idades do homem mais novo com a mulher mais velha.
		
		int menAge[] = new int[2], womenAge[] = new int[2], choice;
		
		do {
			setMenAge(menAge);
			setWomenAge(womenAge);
			
			JOptionPane.showMessageDialog(null, "Soma das idades!"
											+ "\nIdade Homem mais velho: " + menAge[1] + " anos"
											+ "\nIdade Mulher mais nova: " +womenAge[0] + " anos"
											+ "\nTotal: " + (menAge[1] + womenAge[0]) + " anos");
	
			JOptionPane.showMessageDialog(null, "Produto da idade do homem mais novo com a mulher mais velha!"
											+ "\nIdade Homem mais novo: " + menAge[0] + " anos"
											+ "\nIdade Mulher mais velha: " +womenAge[1] + " anos"
											+ "\nTotal: " + (menAge[0] * womenAge[1]) + " anos");
	
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void setWomenAge(int[] womenAge) {
		do {
			for( int i = 0; i < 2; i++ ) {
				womenAge[i] = Integer.parseInt(JOptionPane.showInputDialog("Idade das Mulheres", "Digite a idade da mulher " + (i+1)));
			}
			if( womenAge[0] == womenAge[1] ) {
				JOptionPane.showMessageDialog(null, "Digite idades diferentes");
			}
		} while( womenAge[0] == womenAge[1] );
		
		Arrays.sort(womenAge);
		
	}

	private static void setMenAge(int[] menAge) {
		do {
			for( int i = 0; i < 2; i++ ) {
					menAge[i] = Integer.parseInt(JOptionPane.showInputDialog("Idade dos Homens", "Digite a idade do homem " + (i+1)));
			}
			if( menAge[0] == menAge[1] ) {
				JOptionPane.showMessageDialog(null, "Digite idades diferentes");
			}
		} while( menAge[0] == menAge[1]);
		
		Arrays.sort(menAge);
		
	}

}
