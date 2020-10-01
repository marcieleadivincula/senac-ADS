package prImpostoRenda;

public class Imposto {
	private double aliquota;
	private double rendaAnual;
	
	public double CalculaImposto() {
		double result = rendaAnual * aliquota;
		 return result;
	}
	
	public Imposto(double aliquota, double rendaAnual) {
		this.aliquota = aliquota;
		this.rendaAnual = rendaAnual;
	}
	
	public void SetAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	
	public double GetAliquota() {
		return this.aliquota;
	}
	
	public void SetRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public double GetRendaAnual() {
		return this.rendaAnual;
	}
}
