package bytebank;

public class TestaReferencias {

	public static void main(String[] args) {
		Conta conta1 = new Conta(); // nova instância de um objeto
		conta1.saldo = 300;
		System.out.println("Saldo conta1: " + conta1.saldo);
		
		Conta conta2 = conta1; // duas referências do mesmo objeto
		System.out.println("Saldo conta2: " + conta2.saldo); // 300.0
		
		conta2.saldo += 100;
		System.out.println("Saldo conta2: " + conta2.saldo); //400.0
		
		System.out.println("Saldo conta1: " + conta1.saldo); //400.0
		
		if (conta1 == conta2) {
			System.out.println("Mesma conta!");
		}else {
			System.out.println("Contas diferentes!");
		}
		
		System.out.println(conta1); //bytebank.Conta@470e2030
		System.out.println(conta2); //bytebank.Conta@470e2030
	}

}
