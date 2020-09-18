
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		conta.setAgencia(45);
		System.out.println(conta.getAgencia());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular()); //Cliente@782830e
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		Cliente titularConta = conta.getTitular();
		titularConta.setProfissao("devops");
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(titularConta); //Cliente@782830e
		System.out.println(paulo); //Cliente@782830e
		System.out.println(conta.getTitular()); //Cliente@782830e
		
	}

}
