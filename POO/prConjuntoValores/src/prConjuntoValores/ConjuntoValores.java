package prConjuntoValores;

import javax.swing.JOptionPane;

public class ConjuntoValores {

	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
		
		int maior = valor, menor = valor;
		
		while(valor != 0) {
			if (valor > maior) {
				maior = valor;
			}
			
			if (valor < menor) {
				menor = valor;
			}
			
			valor = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
		}
		
		JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);
	}

}
