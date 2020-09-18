package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	// Como criar métodos
	public void deposita(double saldo) {
		this.saldo += saldo;
	}

	public boolean saca(double saldo, int numero) {
		if (this.saldo >= saldo && this.numero == numero) {
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
}
