package prAEO07082020;

import javax.swing.JOptionPane;

public class CaracteristicasFisicas {

	public static void main(String[] args) {
		String sexo, olho, cabelo;

		double mediaIdade = 0.0, maisDe60 = 0.0;
		int idade = 0, totalPessoas = 0, qtdSexoF = 0, qtdSexoM = 0, somaIdade = 0;

		sexo = JOptionPane.showInputDialog("F = feminino , M = masculino ou N = sair");

		while (!sexo.equalsIgnoreCase("N")) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			olho = JOptionPane.showInputDialog("Olho azul , verde ou castanho");
			cabelo = JOptionPane.showInputDialog("Cabelo loiro , castanho ou preto");

			somaIdade += idade;

			if (idade >= 60) {
				maisDe60 = idade;
			}

			if (sexo.equalsIgnoreCase("f")) {
				if ((idade >= 17) && (idade <= 36) && (olho.equalsIgnoreCase("verde"))
						&& (cabelo.equalsIgnoreCase("loiro"))) {
					qtdSexoF++;
				}
			} else if (sexo.equalsIgnoreCase("m")) {
				if ((idade >= 18) && ((olho.equalsIgnoreCase("verde")) || olho.equalsIgnoreCase("castanho"))
						&& (cabelo.equalsIgnoreCase("preto"))) {
					qtdSexoM++;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente!");
				somaIdade -= idade;
				break;
			}

			totalPessoas++;
			sexo = JOptionPane.showInputDialog("F = feminino , M = masculino ou N = sair");
		}

		maisDe60 = (maisDe60 * 100) / totalPessoas;
		qtdSexoM = (qtdSexoM * 100) / totalPessoas;
		mediaIdade = somaIdade / totalPessoas;

		JOptionPane.showMessageDialog(null,
				"Média das idades =  " + mediaIdade + "%" + "\nPercentual acima de 60 anos = " + maisDe60
						+ "\nPercentual do sexo masculino = " + qtdSexoM + "%" + "\nQuantidade do sexo feminino = "
						+ qtdSexoF);

	}

}
