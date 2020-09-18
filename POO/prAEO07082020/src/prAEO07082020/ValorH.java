package prAEO07082020;

public class ValorH {

	public static void main(String[] args) {
		int h = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 1; j <= 50; j++) {
				if (i % 2 != 0) {
					h += ((i + i) / j);
				} else {
					h -= ((i + i) / j);
				}
			}
		}

		System.out.println("H = " + h);

	}

}
