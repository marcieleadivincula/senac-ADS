package prCalculadora;

public class App {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println("Divis�o: " + calc.divideNum(150, 50));
		System.out.println("Divis�o: " + calc.divideNum(160, 8));
		System.out.println("Multiplica��o: " + calc.multiplicaNum(50, 50));
		System.out.println("Multiplica��o: " + calc.multiplicaNum(16, 16));
		System.out.println("Subtra��o: " + calc.subtraiNum(890, 456));
		System.out.println("Subtra��o: " + calc.subtraiNum(850, 158));
		System.out.println("Soma: " + calc.somaNum(150, 500));
		System.out.println("Soma: " + calc.somaNum(160, 85));
	}

}
