package prIRF;

public class Imposto {
	private double aliquota;

	public void defineAliquota() {
		double rendaAnual = 0;
		if (rendaAnual > 35000.0) {
			setAliquota(0.30);
		} else if (rendaAnual >= 25001) {
			setAliquota(0.275);
		} else if (rendaAnual >= 9001) {
			setAliquota(0.15);
		} else if (rendaAnual >= 4001) {
			setAliquota(0.058);
		} else if (rendaAnual <= 4000) {
			setAliquota(0.0);
		} else {
			System.out.println("Valor inválido!");
		}
	}
	
	public void CalculaImposto(double rendaAnual) {
		double imposto = rendaAnual * getAliquota();
	}

	public Imposto(double aliquota) {
		this.aliquota = aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public double getAliquota() {
		return this.aliquota;
	}
}
