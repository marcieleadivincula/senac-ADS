package bytebank;

public class CriarConta {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 200.5;
		conta1.agencia = 15010;
		conta1.numero = 150;
		conta1.titular = "Maria Alves";
		
		System.out.println("Saldo: " + conta1.saldo + "\nAgência: " + conta1.agencia + "\nNúmero: " + conta1.numero + "\nTitular: " + conta1.titular);
		
		conta1.saldo += 100;
		System.out.println("Primeira conta: " + conta1.saldo);
		
		Conta conta2 = new Conta();
		conta2.saldo = 50;	
		System.out.println("Segunda conta: " + conta2.saldo);
		
		System.out.println("Saldo conta2 : " + conta2.saldo); // default 0.0
		System.out.println("Agência conta2: " + conta2.agencia); // default 0
		System.out.println("Número conta2: " + conta2.numero); // default 0
		System.out.println("Titular conta2: " + conta2.titular); // default null
	}
}
