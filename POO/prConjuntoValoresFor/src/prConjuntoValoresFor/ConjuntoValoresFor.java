package prConjuntoValoresFor;

import javax.swing.JOptionPane;

public class ConjuntoValoresFor {

	public static void main(String[] args) {
		int valor, maior = 0, menor = 999999999;

		for (;;) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));

			if (valor == 0) {
				break;
			}

			if (valor > maior) {
				maior = valor;
			}

			if (valor < menor) {
				menor = valor;
			}
		}

		JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);

	}

}
