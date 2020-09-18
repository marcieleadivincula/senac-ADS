
public class TestaWhile {

	public static void main(String[] args) {
		System.out.println("Ordem descrescente: ");
		int contador = 100;

		while (contador >= 0) {
			System.out.println(contador);
			contador--;
		}
		
		System.out.println("Ordem crescente: ");
		
		int numero = 0;
		while (numero <= 100) {
			System.out.println(numero);
			numero++;
		}
	}

}
