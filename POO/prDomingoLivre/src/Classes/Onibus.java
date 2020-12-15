package Classes;

public class Onibus {
	private int codOnibus;
	private int qtdTotalPessoas;
	
	public Onibus(int qtdTotalPessoas) {
		this.qtdTotalPessoas = qtdTotalPessoas;
	}
	
	public int getQtdTotalPessoas() {
		return this.qtdTotalPessoas;
	}

	public void setQtdTotalPessoas(int qtdTotalPessoas) {
		this.qtdTotalPessoas = qtdTotalPessoas;
	}
	
	public int getCodOnibus() {
		return this.codOnibus;
	}

	public void setCodOnibus(int codOnibus) {
		this.codOnibus = codOnibus;
	}
}
