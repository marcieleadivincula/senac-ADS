
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		System.out.println(paulo.nome);
		System.out.println(paulo.cpf);
		System.out.println(paulo.profissao);
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		System.out.println(contaPaulo.getSaldo());
		
		contaPaulo.titular = paulo;
		System.out.println(contaPaulo.titular); //Cliente@782830e
		System.out.println(contaPaulo.titular.nome); //Paulo Silveira
	}

}
