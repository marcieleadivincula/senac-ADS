
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int qtdPessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� � maior de idade, pode entrar!");
			System.out.println("Seja bem vindo!");
		} else {
			if (qtdPessoas >= 2) {
				System.out.println("Voc� � menor de idade, mas est� acompanhado. Pode entrar!");
			} else {
				System.out.println("Voc� � menor de idade, infelizmente n�o pode entrar!");
			}
		}

	}

}
