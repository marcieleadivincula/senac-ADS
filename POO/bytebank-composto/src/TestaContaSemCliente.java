
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaMarcela = new Conta();
		System.out.println(contaMarcela.getSaldo());
		
		contaMarcela.titular = new Cliente();
		System.out.println(contaMarcela.titular);
		contaMarcela.titular.nome = "Marcela";
		System.out.println(contaMarcela.titular.nome);
		
		Pessoa pes = new Pessoa();
		pes.nome = "Paulo";
		pes.endereco = new Endereco(); 
		pes.endereco.logradouro = "Avenida XYZ";
		
		//O cliente da classe Pessoa, ou seja, quem a esta utilizando, teve que atribuir uma instância de Endereco à propriedade p.endereco para que não houvesse NullPointerException.
	}

}
