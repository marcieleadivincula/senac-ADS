
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

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
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
