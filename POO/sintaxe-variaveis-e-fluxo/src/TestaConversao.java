
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		System.out.println("Salário: " + salario);
		int valor = (int)salario;
		System.out.println("Valor: " + valor);
		
		long numeroGrande = 3232323232323233232l;
		System.out.println("LONG: " + numeroGrande);
		
		short valorPequeno = 2121;
		System.out.println("SHORT: " + valorPequeno);
		
		byte b = 127;
		System.out.println("BYTE: " + b);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
		float pontoFlutuante = 1.70f;
		System.out.println(pontoFlutuante);
	}

}
