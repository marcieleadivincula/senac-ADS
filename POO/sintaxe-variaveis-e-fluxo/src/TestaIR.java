
public class TestaIR {

	public static void main(String[] args) {
		//Até 1.903,98 o IR é isento
		// De 1.903,99 até 2.826,65 o IR é de 7.5% e pode deduzir R$ 142.80
        // De 2.826,66 até 3.751,05 o IR é de 15% e pode deduzir R$ 354.80
        // De 3.751,06 até 4.664,68 o IR é de 22.5% e pode deduzir R$ 636.13
		// Acima de 4.664,68 o IR é de 27.5% e pode deduzir R$ 869.36
		
		double salario = 3300.0;

		if (salario >= 4664.68) {
			System.out.println("Alíquota (27,5 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 869,36)");
		} else if (salario >= 3751.06) {
			System.out.println("Alíquota (22,5 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 636,13)");
		} else if (salario >= 2826.66) {
			System.out.println("Alíquota (15 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 354,80)");
		} else if (salario >= 1903.99) {
			System.out.println("Alíquota (7,5 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 142,80)");
		} else if (salario <= 1903.98) {
			System.out.println("Alíquota (0 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 0)");
		}
		
		System.out.println("Final da execução");
	}

}
