
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais 2");

		int idade = 16;
		int qtdPessoas = 3;
		boolean acompanhado = qtdPessoas >= 2;

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente não pode entrar!");
		}
	}

}
