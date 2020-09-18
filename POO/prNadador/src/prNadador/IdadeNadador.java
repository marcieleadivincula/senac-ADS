package prNadador;

import javax.swing.JOptionPane;

public class IdadeNadador {

	public static void main(String[] args) {
		int age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

		if (age <= 0) {
			JOptionPane.showMessageDialog(null, "Idade inválida!!");
			return;
		} else if (age > 17) {
			JOptionPane.showMessageDialog(null, "Sênior!");
		} else if (age >= 14) {
			JOptionPane.showMessageDialog(null, "Juvenil B!");
		} else if (age >= 11) {
			JOptionPane.showMessageDialog(null, "Juvenil A!");
		} else if (age >= 8) {
			JOptionPane.showMessageDialog(null, "Infantil B!");
		} else if (age >= 5) {
			JOptionPane.showMessageDialog(null, "Infantil A!");
		} else {
			JOptionPane.showMessageDialog(null, "Sem categoria!");
		}

		//Exemplo com switch
		switch (age) {
		case 1:
		case 2:
		case 3:
		case 4: {
			JOptionPane.showMessageDialog(null, "Sem categoria!");
		};
			break;
		case 5:
		case 6:
		case 7: {
			JOptionPane.showMessageDialog(null, "Infantil A!");
		};
			break;
		case 8:
		case 9:
		case 10: {
			JOptionPane.showMessageDialog(null, "Infantil B!");
		};
			break;
		case 11:
		case 12:
		case 13: {
			JOptionPane.showMessageDialog(null, "Juvenil A!");
		};
			break;
		case 14:
		case 15:
		case 16:
		case 17: {
			JOptionPane.showMessageDialog(null, "Juvenil B!");
		};
			break;
		case 18: {
			JOptionPane.showMessageDialog(null, "Sênior!");
		};
			break;
		default: {
			JOptionPane.showMessageDialog(null, "Idade inválida!!");
		};
			break;
		}
	}

}
