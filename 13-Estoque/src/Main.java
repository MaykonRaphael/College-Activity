import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva
//		um algoritmo que permita a entrada das seguintes informações: a) o número total de
//		mercadorias no estoque; b) o valor de cada mercadoria. Ao final imprimir o valor
//		total em estoque e a média de valor das mercadorias.

		int totalProduct, choice;
		
		do {

			totalProduct = setTotalProduct();
			
			PriceProduct(totalProduct);
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void PriceProduct(int totalProduct) {
		double priceProduct[] = new double[totalProduct], total = 0;
		for( int i = 0; i <= totalProduct - 1; i++ ) {
			priceProduct[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto " + (i+1)));
			total += priceProduct[i];
		}
		
		JOptionPane.showMessageDialog(null, "Valor total dos produtos em estoque: R$" + total
										+ "Media dos valores em estoque: R$" + (total / totalProduct));
	}

	private static int setTotalProduct() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite quantos produtos estao no estoque!"));
	}

}
