import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo
//		seja diferente de um c�digo armazenado internamente no algoritmo (igual a 1234)
//		deve ser apresentada a mensagem �Usu�rio inv�lido!�. Caso o C�digo seja correto,
//		deve ser lido outro valor que � a senha. Se esta senha estiver incorreta (a certa �
//		9999) deve ser mostrada a mensagem �senha incorreta�. Caso a senha esteja correta,
//		deve ser mostrada a mensagem �Acesso permitido�.
		
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
