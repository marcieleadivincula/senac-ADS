package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.numero = 85;
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		System.out.println(conta.numero);
		System.out.println("=======================================");
		
		boolean conseguiu = conta.saca(130, 85);
		System.out.println(conta.saldo);
		System.out.println(conta.numero);
		System.out.println(conseguiu);
		
		System.out.println("=======================================");
		
		conseguiu = conta.saca(200, 85);
		System.out.println(conta.saldo);
		System.out.println(conta.numero);
		System.out.println(conseguiu);
		
		System.out.println("=======================================");
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		contaMarcela.transfere(300, contaPaulo);
		
		boolean sucessoTransferencia = contaMarcela.transfere(300, contaPaulo);
		if (sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso!");
		}else {
			System.out.println("Não tem dinheiro suficiente!");
		}
		
		System.out.println("Marcela: " + contaMarcela.saldo);
		System.out.println("Paulo: " + contaPaulo.saldo);
	}

}
