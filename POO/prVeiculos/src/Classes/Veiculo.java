package Classes;

public class Veiculo {
	private String placa;
	private int ano;
	private String motor;
	private String chassi;
	private String cor;
	private String montadora;

	public Veiculo(String placa, int ano, String motor, String chassi, String cor, String montadora) {
		this.placa = placa;
		this.ano = ano;
		this.motor = motor;
		this.chassi = chassi;
		this.cor = cor;
		this.montadora = montadora;
	}

	public String toString() {
		return "Placa: " + getPlaca() + " Ano: " + getAno() + " Motor: " + getMotor() + "\nChassi: " + getChassi() + " Cor: " + getCor() + " Montadora: " + getMontadora();
	}

	public int getIdade() {
		return 2020 - this.getAno();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

}
