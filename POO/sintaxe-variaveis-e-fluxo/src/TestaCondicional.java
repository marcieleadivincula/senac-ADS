
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int qtdPessoas = 3;

		if (idade >= 18) {
			System.out.println("Você é maior de idade, pode entrar!");
			System.out.println("Seja bem vindo!");
		} else {
			if (qtdPessoas >= 2) {
				System.out.println("Você é menor de idade, mas está acompanhado. Pode entrar!");
			} else {
				System.out.println("Você é menor de idade, infelizmente não pode entrar!");
			}
		}

	}

}
