package prAEO31072020;

import javax.swing.JOptionPane;

public class Salario {

	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário: "));
		double desconto;

		if(salario > 2000.0) {
			desconto = (100 * 127.89)/ salario; 
			System.out.println("Aumento em reais de R$127,89");
			System.out.println("Equivale a " + desconto + "%");
		}
		else if(salario >= 1001.0) {
			desconto = (100 * 174.34)/ salario; 
			System.out.println("Aumento em reais de R$174,34");
			System.out.println("Equivale a " + desconto + "%");
		}
		else if(salario >= 1000.0) {
			desconto = (100 * 193.56)/ salario; 
			System.out.println("Aumento em reais de R$193,56");
			System.out.println("Equivale a " + desconto + "%");
		}
		else {
			System.out.println("Valor indefinido");
		}

	}

}
