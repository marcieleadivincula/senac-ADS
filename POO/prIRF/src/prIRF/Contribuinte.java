package prIRF;

public class Contribuinte {
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	@Override
	public String toString() {
		String resultado = "\nNome do contribuinte: " + getNome() + "\nCPF: " + getCpf() + "\nUF: " + getUf()
				+ "\nRenda anual: " + getRendaAnual() + "\nPercentual de contribuição: " + getPercentContribuicao() + "\nImposto à pagar: " + getImpostoAPagar();
		return resultado;
	}

	public double getPercentContribuicao() {
		if (getRendaAnual() <= 4000) {
			return 0;
		} else if (getRendaAnual() <= 9000) {
			return 5.8;
		} else if (getRendaAnual() <= 25000) {
			return 15;
		} else if (getRendaAnual() <= 35000) {
			return 27.5;
		} else {
			return 30;
		}
	}

	public double getImpostoAPagar() {
		double percent = getPercentContribuicao();
		if (percent == 0) {
			return 0;
		}else {
			return (getRendaAnual() * percent) / 100;
		}
	}
	
	// Construtor sem parâmetros
	public Contribuinte() {

	}

	// Construtor com parâmetros
	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		this.nome = nome;
		this.cpf = cpf;
		this.uf = uf;
		this.rendaAnual = rendaAnual;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
}
