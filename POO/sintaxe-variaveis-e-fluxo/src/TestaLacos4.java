
public class TestaLacos4 {

	public static void main(String[] args) {
		// Utilize um la�o do tipo for para imprimir todos os m�ltiplos de 3, entre 1 e 100.
		for (int multiplo = 0; multiplo <= 100; multiplo++) {
			for (int numero = 1; numero <= multiplo; numero++) {
				if (numero % 3 == 0) {
					System.out.print(numero);
					System.out.print(" ");
				} else {
					break;
				}
			}
			System.out.println();
		}

	}

}
