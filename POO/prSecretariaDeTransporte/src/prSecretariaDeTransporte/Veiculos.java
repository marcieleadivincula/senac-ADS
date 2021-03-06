package prSecretariaDeTransporte;

public class Veiculos {
	private String placa;
	private int ano;
	private String motor;
	private String chassi;
	private String cor;
	private String montadora;

	// Construtor sem parāmetros
	public Veiculos() {

	}

	// construtor com parāmetros
	public Veiculos(String placa, int ano, String motor, String chassi, String cor, String montadora) {
		this.setPlaca(placa);
		this.setAno(ano);
		this.setMotor(motor);
		this.setChassi(chassi);
		this.setCor(cor);
		this.setMontadora(montadora);
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
