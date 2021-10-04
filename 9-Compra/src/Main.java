import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e
//		o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço
//		unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
//		que:
//		● Se quantidade <= 5 o desconto será de 2%
//		● Se quantidade > 5 e quantidade <=10 o desconto será de 3%
//		● Se quantidade > 10 o desconto será de 5%
		
		String name;
		int amount, choice;
		double price;
		
		do {
			
			name = setName();
			amount = setAmount(name);
			price = setPrice(name);
			
			calculateBill(name, amount, price);

			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void calculateBill(String name, int amount, double price) {
		double discount = 0;
		if( amount <= 5 ) {
			discount = amount * price * 0.02;
		} else if( amount > 5 && amount <= 10 ) {
			discount = amount * price * 0.03;
		} else {
			discount = amount * price * 0.05;
		}
		JOptionPane.showMessageDialog(null, "Total da compra: R$" + (amount * price)
											+ "\nDesconto: R$" + discount
											+ "\nTotal a pagar: R$" + ((amount * price) - discount));
		
	}

	private static String setName() {
		return JOptionPane.showInputDialog("Digite o nome do produto!");
	}

	private static int setAmount(String name) {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade adquirida de " + name + "!"));
	}

	private static double setPrice(String name) {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto " + name + "!"));
	}

}
