import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Escreva um algoritmo que imprima as seguintes seq��ncias de n�meros: (1, 1 2 3 4 5
//		6 7 8 9 10) (2, 1 2 3 4 5 6 7 8 9 10) (3, 1 2 3 4 5 6 7 8 9 10) (4, 1 2 3 4 5 6 7 8 9 10) e
//		assim sucessivamente, at� que o primeiro n�mero (antes da v�rgula), tamb�m chegue
//		a 10.
		
		int choice;
		String arrayConst = "1 2 3 4 5 6 7 8 9 10";
		
		do {
		
			for( int i = 1; i <= 10; i++ ) {
				JOptionPane.showMessageDialog(null, "(" + i + ", " + arrayConst + ")");
			}
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

}
