package prCalculadora;

public class Calculadora {
	private double primeiroNumero;
	private double segundoNumero;
	
	public void getNumUm(double primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}
	
	public double setNumUm() {
		return this.primeiroNumero;
	}
	
	public void getNumDois(double segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	
	public double setNumDois() {
		return this.segundoNumero;
	}
	
	public double somaNum(double primeiroNumero, double segundoNumero) {
		double result = primeiroNumero + segundoNumero;
		return result;
	}
	
	public double divideNum(double primeiroNumero, double segundoNumero) {
		double result = primeiroNumero / segundoNumero;
		return result;
	}
	
	public double subtraiNum(double primeiroNumero, double segundoNumero) {
		double result = primeiroNumero - segundoNumero;
		return result;
	}
	
	public double multiplicaNum(double primeiroNumero, double segundoNumero) {
		double result = primeiroNumero * segundoNumero;
		return result;
	}
}
