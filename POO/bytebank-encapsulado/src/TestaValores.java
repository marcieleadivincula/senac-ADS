
public class TestaValores {

	public static void main(String[] args) {
//		Conta conta = new Conta();
//		conta.setAgencia(-50);
//		conta.setNumero(-330);
//		System.out.println(conta.getAgencia());

		//Conta conta = new Conta(2585.50, 1337, 24226,{"João da Silva", "085.156.489-20", "programador"});
		//System.out.println(conta);
		
		int total = 0;
		Conta conta1 = new Conta(1337, 24226);
		System.out.println(conta1.getAgencia());
		
		conta1.setAgencia(1232123);
		
		Conta conta2 = new Conta(1338, 16549);
		System.out.println(conta2);
		
		Conta conta3 = new Conta(1339, 15483);
		System.out.println(conta3);
		
		// estava dando erro, pois o método precisa ser estático também, ou seja, que também pertence a class
		System.out.println(Conta.getTotal());
		
		
	}
}
