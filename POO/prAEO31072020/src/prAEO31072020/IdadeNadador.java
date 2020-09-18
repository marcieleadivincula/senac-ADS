package prAEO31072020;

import javax.swing.JOptionPane;

public class IdadeNadador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

		if (age <= 0) {
			JOptionPane.showMessageDialog(null, "Idade não existe!!");
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
	}

}
