package prIdade;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de nascimento"));

		JOptionPane.showMessageDialog(null, "Idade em anos = " + (2020 - idade));

		System.out.println("Idade em anos = " + (2020 - idade));
	}

}
