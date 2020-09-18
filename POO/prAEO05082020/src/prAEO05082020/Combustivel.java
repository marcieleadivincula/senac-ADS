package prAEO05082020;

import javax.swing.JOptionPane;

public class Combustivel {

	public static void main(String[] args) {
		// Faça um programa em Java que efetue o cálculo da quantidade de litros de
		// combustível gastos em uma viagem, utilizando um automóvel que faz 12 Km por
		// litro. Para obter o cálculo, o usuário deverá fornecer o tempo gasto na
		// viagem e a velocidade média durante a mesma. Dessa forma será possível obter
		// a distância percorrida com a fórmula: Distância = (Tempo * velocidade). Tendo
		// o valor da distância, basta calcular a quantidade de litros gasto na viagem,
		// da distância percorrida e da quantidade de litros utilizada na viagem.

		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Tempo")),
				vm = Double.parseDouble(JOptionPane.showInputDialog("Velocidade")), deslocamento = (tempo * vm),
				kmLitro = deslocamento / 12;

		JOptionPane.showMessageDialog(null,
				"Quantidade de litros: " + kmLitro + "\nDistância percorrida: " + deslocamento);

	}

}
