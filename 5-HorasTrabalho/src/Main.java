import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
//		trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular
//		com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas
//		trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
//		que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere
//		que o mês possua 4 semanas exatas).
		
		int choice;
		double timeMonthWork, hourWage;
		
		do {
			timeMonthWork = setTimeMonthWork();
			hourWage = setHourWage();
			
			calculateExtraHour(timeMonthWork,hourWage);
	
			choice = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?");
			
		} while( choice == JOptionPane.YES_OPTION );

	}

	private static void calculateExtraHour(double timeWeekWork, double hourWage) {
		double extraWeekHour = (timeWeekWork/4 - 40), hourExtraWage = 0;
		if( timeWeekWork / 4 > 40 ) {
			timeWeekWork = (timeWeekWork/4 - extraWeekHour);
			hourExtraWage = hourWage + hourWage * 0.5;
			JOptionPane.showMessageDialog(null, "Seu salario com hora extra: R$" + 
											((timeWeekWork * hourWage) + (extraWeekHour * hourExtraWage)) * 4);
		} else {
			JOptionPane.showMessageDialog(null, "Seu salario: R$" + (timeWeekWork * hourWage));
		}
		
	}

	private static double setHourWage() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite quanto voce ganha por hora trabalhada!"));
	}

	private static int setTimeMonthWork() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite quantas horas foram trabalhadas no mes!"));
	}

}
