package prAEO07082020;

public class DezPrimeirosNumeros {

	public static void main(String[] args) {
		int serie = 1;

		for (int i = 0; i <= 500; i++) {
			if (i % 2 == 0) {
				serie += (2 / (i - 50));
			} else {
				serie -= (5 / (i - 50));
			}
		}

		System.out.println("Série = " + serie);

	}

}
