
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //declara que este objeto � da classe, ou seja, static = da classe

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	// Construtor com par�metros
	public Conta(double saldo, int agencia, int numero, Cliente titular) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
	public void deposita(double saldo) {
		this.saldo += saldo;
	}

	public boolean saca(double saldo) {
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double saldo, Conta destino) {
		if (this.saldo >= saldo && this.numero == destino.numero) {
			this.saldo -= saldo;
			// destino.saldo += saldo;
			destino.deposita(saldo);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getAgencia() {
		return this.agencia;
	}
	
	public double getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
