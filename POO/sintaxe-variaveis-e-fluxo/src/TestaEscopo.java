
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando escopo");

		int idade = 16;
		int qtdPessoas = 3;
		//boolean acompanhado = qtdPessoas >= 2;
		boolean acompanhado;
		
		if (qtdPessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente não pode entrar!");
		}
	}

}
