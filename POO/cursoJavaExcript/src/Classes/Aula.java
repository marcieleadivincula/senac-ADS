package Classes;

import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o seu dia da semana predileto?");
		System.out.println("Digite 1 para segunda e 7 para domingo");
		int num = in.nextInt();

		String dia = (num == 1) ? "segunda"
				: (num == 2) ? "ter�a"
						: (num == 3) ? "quarta"
								: (num == 4) ? "quinta"
										: (num == 5) ? "sexta"
												: (num == 6) ? "s�bado" : (num == 7) ? "domingo" : "Dia inv�lido";

		switch (num) {
		case 1:
			dia = "segunda";
			break;
		case 2:
			dia = "ter�a";
			break;
		case 3:
			dia = "quarta";
			break;
		case 4:
			dia = "quinta";
			break;
		case 5:
			dia = "sexta";
			break;
		case 6:
			dia = "s�bado";
			break;
		case 7:
			dia = "domingo";
			break;
		default:
			dia = "Dia inv�lido";
			break;
		}

		System.out.println("O dia escolhido foi: " + dia);
	}

}
