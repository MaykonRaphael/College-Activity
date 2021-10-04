import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Faça um algoritmo para ler um número que é um código de usuário. Caso este código
//		seja diferente de um código armazenado internamente no algoritmo (igual a 1234)
//		deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja correto,
//		deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é
//		9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta,
//		deve ser mostrada a mensagem ‘Acesso permitido’.
		
		int code = 1234, inputCode, password = 9999, inputPassword, choice;
		
		do {
			inputCode = setInputCode();
			
			if( inputCode == code ) {
				inputPassword = setInputPassword();
				if( inputPassword == password ) {
					JOptionPane.showMessageDialog(null, "Acesso Permitido!");
				} else {
					JOptionPane.showMessageDialog(null, "Senha Incorreta!");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Usuario Invalido!");
			}
	
	
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );
		

	}
	
	private static int setInputCode() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo de acesso!"));
	}

	private static int setInputPassword() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite a senha de acesso!"));
	}

}
