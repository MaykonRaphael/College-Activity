import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e
//		escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor de
//		cada lado deve ser menor que a soma dos outros 2 lados.

		int choice;
		double A, B, C;
		
		do {
			A = setA();
			B = setB();
			C = setC();
			
			verifyTriangle(A,B,C);
	
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void verifyTriangle(double a, double b, double c) {
		if( a + b > c && a + c > b && b + c > a ) {
			JOptionPane.showMessageDialog(null, "Os valores formam um triangulo!");
		} else {
			JOptionPane.showMessageDialog(null, "Os valores nao formam um triangulo!");
		}
		
	}

	private static double setA() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A!"));
	}

	private static double setB() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado B!"));
	}

	private static double setC() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado C!"));
	}

}
