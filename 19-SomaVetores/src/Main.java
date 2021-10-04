import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores).
//		Após, ler dois vetores A e B (de tamanho N cada um) e depois armazenar em um
//		terceiro vetor Soma a soma dos elementos do vetor A com os do vetor B (respeitando
//		as mesmas posições) e escrever o vetor Soma.
		
		int choice, N;
		
		do {
			
			N = setN();
			int A[] = new int[N], B[] = new int[N];
			
			sum(A,B,N);
			
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void sum(int[] a, int[] b, int n) {
		int sum[] = new int[n];
		String showSum = "";
		for( int i = 0; i < n; i++ ) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("VETOR A\nDigite o valor para a posicao " + (i+1)));
			b[i] = Integer.parseInt(JOptionPane.showInputDialog("VETOR B\nDigite o valor para a posicao " + (i+1)));
			sum[i] = a[i] + b[i];
			showSum += " " + sum[i] + "\n";
		}

		JOptionPane.showMessageDialog(null, ("Soma\n" + showSum));
		
		
	}

	private static int setN() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor que deseja!"));
	}

}
