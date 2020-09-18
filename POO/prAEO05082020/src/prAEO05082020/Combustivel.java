package prAEO05082020;

import javax.swing.JOptionPane;

public class Combustivel {

	public static void main(String[] args) {
		// Fa�a um programa em Java que efetue o c�lculo da quantidade de litros de
		// combust�vel gastos em uma viagem, utilizando um autom�vel que faz 12 Km por
		// litro. Para obter o c�lculo, o usu�rio dever� fornecer o tempo gasto na
		// viagem e a velocidade m�dia durante a mesma. Dessa forma ser� poss�vel obter
		// a dist�ncia percorrida com a f�rmula: Dist�ncia = (Tempo * velocidade). Tendo
		// o valor da dist�ncia, basta calcular a quantidade de litros gasto na viagem,
		// da dist�ncia percorrida e da quantidade de litros utilizada na viagem.

		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Tempo")),
				vm = Double.parseDouble(JOptionPane.showInputDialog("Velocidade")), deslocamento = (tempo * vm),
				kmLitro = deslocamento / 12;

		JOptionPane.showMessageDialog(null,
				"Quantidade de litros: " + kmLitro + "\nDist�ncia percorrida: " + deslocamento);

	}

}
