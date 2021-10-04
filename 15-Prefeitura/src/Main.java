import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	private static final int TAM = 5;

	public static void main(String[] args) {
//		A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um
//		algoritmos para coletar dados sobre o salário e número de filhos de cada habitante e
//		após as leituras, escrever:
//		a) Média de salário da população
//		b) Média do número de filhos
//		c) Maior salário dos habitantes
//		d) Percentual de pessoas com salário menor que R$ 150,00
		
		int children[] =new int[TAM], choice;
		double wage[] = new double[TAM];
		
		do {
			for( int i = 0; i < TAM; i++ ) {
				wage[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario da pessoa " + (i+1)));
				children[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos(as) filhos(as) tem a pessoa " + (i+1)));
			}
			
			calculateAvarege(wage, children);
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void calculateAvarege(double[] wage, int[] children) {
		double wageAvarege = 0;
		int childrenAvarege = 0;
		for( int i = 0; i < TAM; i++ ) {
			wageAvarege += wage[i];
			childrenAvarege += children[i];
		}
		JOptionPane.showMessageDialog(null, "A média salárial da população é: " + (wageAvarege / TAM));
		JOptionPane.showMessageDialog(null, "A média do numero de filhos da população é: " + (childrenAvarege / TAM));
		Arrays.sort(wage);
		JOptionPane.showMessageDialog(null, "O maior salário é: " + wage[wage.length-1]);
		
		percentageOfPeople(wage);
		
	}

	private static void percentageOfPeople(double[] wage) {
		int people = 0;
		for( int i = 0; i < TAM; i++ ) {
			if( wage[i] < 150 ) {
				people += 1;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Pessoas com salario menor que R$150: " + ((people*100) / wage.length) + "%");
		
	}

}
