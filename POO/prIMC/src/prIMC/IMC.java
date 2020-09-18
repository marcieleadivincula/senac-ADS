package prIMC;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		// TODO Elabore um programa em Java que determine o grau de obesidade de uma
		// pessoa, sendo fornecido o seu peso e a sua altura. O grau de obesidade é
		// determinado pelo índice da massa corpórea (Massa = Peso / (Altura * Altura))
		// conforme tabela abaixo:
		// Massa corpórea Grau de Obesidade
		// <26 normal
		// >=26 e <= 30 obeso
		// >=30 obeso mórbido

		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso")),
				altura = Double.parseDouble(JOptionPane.showInputDialog("Altura")), imc = (peso / (altura * altura));

		if (imc <= 18.5) {
			JOptionPane.showMessageDialog(null, "Peso: " + peso + "\nIMC: " + imc + "\nIMC: Abaixo do peso");
		} else if (imc <= 24.9) {
			JOptionPane.showMessageDialog(null, "Peso: " + peso + "\nIMC: " + imc + "\nIMC: Normal");
		} else if (imc <= 29.9) {
			JOptionPane.showMessageDialog(null, "Peso: " + peso + "\nIMC: " + imc + "\nIMC: Sobrepeso");
		} else if (imc > 34.9) {
			JOptionPane.showMessageDialog(null, "Peso: " + peso + "\nIMC: " + imc + "\nIMC: Obeso Grau I");
		} else if (imc <= 39.9) {
			JOptionPane.showMessageDialog(null, "Peso: " + peso + "\nIMC: " + imc + "\nIMC: Obeso Grau II");
		} else {
			JOptionPane.showMessageDialog(null,
					"Peso: " + peso + "\nIMC: " + imc + "\nIMC: Obesidade Grau III ou Mórbida");
		}

	}

}
