import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os
//		nomes lidos em um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1
//		nome qualquer de pessoa e depois escrever a mensagem ACHEI, se o nome estiver
//		entre os 10 nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso
//		contrário.
		
		int choice;
		String names[] = new String[5];
		
		do {

			for( int i = 0; i < names.length; i ++ ) {
				names[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i+1));
			}
			
			findSearchName(names);
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void findSearchName(String[] names) {
		String searchName = JOptionPane.showInputDialog("Digite um nome para eu procurar na lista!");
		boolean find = false;
		
		for( int i = 0; i < names.length; i++ ) {
			if( names[i].equals(searchName) ) {
				find = true;
				break;
			}
		}
		
		if( find == true ) {
			JOptionPane.showMessageDialog(null, "ACHEI");
		} else {
			JOptionPane.showMessageDialog(null, "NAO ACHEI");
		}
		
	}

}
