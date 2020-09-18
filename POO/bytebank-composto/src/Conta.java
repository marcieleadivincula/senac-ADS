
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

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
}
