
public class TestaIR {

	public static void main(String[] args) {
		//At� 1.903,98 o IR � isento
		// De 1.903,99 at� 2.826,65 o IR � de 7.5% e pode deduzir R$ 142.80
        // De 2.826,66 at� 3.751,05 o IR � de 15% e pode deduzir R$ 354.80
        // De 3.751,06 at� 4.664,68 o IR � de 22.5% e pode deduzir R$ 636.13
		// Acima de 4.664,68 o IR � de 27.5% e pode deduzir R$ 869.36
		
		double salario = 3300.0;

		if (salario >= 4664.68) {
			System.out.println("Al�quota (27,5 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 869,36)");
		} else if (salario >= 3751.06) {
			System.out.println("Al�quota (22,5 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 636,13)");
		} else if (salario >= 2826.66) {
			System.out.println("Al�quota (15 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 354,80)");
		} else if (salario >= 1903.99) {
			System.out.println("Al�quota (7,5 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 142,80)");
		} else if (salario <= 1903.98) {
			System.out.println("Al�quota (0 %)");
			System.out.println("Parcela a deduzir do IRF (R$ 0)");
		}
		
		System.out.println("Final da execu��o");
	}

}
