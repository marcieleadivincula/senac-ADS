package prAumento;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Aumento {

	public static void main(String[] args) {
		// Faça um programa que entre com uma valor qualquer e apresente como resultado
		// o valor acrescido de mais 15,5%
		
		DecimalFormat df = new DecimalFormat("#,###,##0.00"); //para formatar valores reais

		Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Infome um valor"));
		Double resultado = valor + ((valor * 15.5) / 100);

		JOptionPane.showMessageDialog(null, "Valor + 15,5% = " + df.format(resultado));
	}

}
