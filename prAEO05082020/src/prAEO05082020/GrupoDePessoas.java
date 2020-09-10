package prAEO05082020;

import javax.swing.JOptionPane;

public class GrupoDePessoas {

	public static void main(String[] args) {
		// Elabore um programa em Java que, dado a idade e o sexo de um grupo de
		// pessoas, apresente no final: a média de idade das pessoas; o percentual de
		// pessoas do sexo masculino e feminino;
		// a maior idade masculina e a menor idade feminina. Para finalizar o sexo
		// deverá ser igual a N.

		String sexo;
		int idade = 0, somaIdade = 0, qtdSexoF = 0, qtdSexoM = 0, qtdTotal = 0, maiorIdade = 0, menorIdade = 150;
		double mediaIdade = 0.0;

		sexo = JOptionPane.showInputDialog("F = feminino , M = masculino ou N = sair");

		while (!sexo.equalsIgnoreCase("N")) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

			somaIdade += idade;

			if (sexo.equalsIgnoreCase("f")) {
				qtdSexoF++;
				if (idade < menorIdade) {
					menorIdade = idade;
				}
			} else if (sexo.equalsIgnoreCase("m")) {
				qtdSexoM++;
				if (idade > maiorIdade) {
					maiorIdade = idade;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente!");
				somaIdade -= idade;
				break;
			}
			sexo = JOptionPane.showInputDialog("F = feminino , M = masculino ou N = sair");
		}
		qtdTotal = qtdSexoF + qtdSexoM;
		mediaIdade = somaIdade / qtdTotal;

		qtdSexoF = (qtdSexoF * 100) / qtdTotal;
		qtdSexoM = (qtdSexoM * 100) / qtdTotal;

		JOptionPane.showMessageDialog(null,
				"Média das idades =  " + mediaIdade + "\nPercentual do sexo masculino = " + qtdSexoM + "%"
						+ "\nPercentual do sexo feminino = " + qtdSexoF + "%" + "\nMaior idade masculina = "
						+ maiorIdade + "\nMenor idade feminina = " + menorIdade);

	}

}
