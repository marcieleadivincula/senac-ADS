package prTrabalhoAvaliativo01;

public class Jogador {
	private String _nome;
	private String _situacao; // titular ou reserva
	private Clube _equipe; // clube
	private double _salario;

	@Override
	public String toString() {
		return "\nNome: " + this.GetNome() + "\nSituação: " + this.GetSituacao() + "\nEquipe: "
				+ this.GetEquipe().toString() + "\nSalário atual: " + this.GetSalario() + "\nNovo salário: " + this.getSalarioNovo();
	}

	public double getSalarioNovo() {
		if (this.GetSalario() <= 9000) {
			return this.GetSalario() + ((this.GetSalario() * 20) / 100);
			//return this.GetSalario() * 1.20;
		} 
		else if (this.GetSalario() <= 13000) {
			return this.GetSalario() + ((this.GetSalario() * 10) / 100);
			//return this.GetSalario() * 1.10;
		} 
		else if (this.GetSalario() <= 18000) {
			return this.GetSalario() + ((this.GetSalario() * 5) / 100);
			//return this.GetSalario() * 1.05;
		} 
		else {
			return this.GetSalario();
		}
	}

	public Jogador() {

	}

	public Jogador(String nome, String situacao, Clube equipe, double salario) {
		this._nome = nome;
		this._situacao = situacao;
		this._equipe = equipe;
		this._salario = salario;
	}

	public void SetNome(String nome) {
		this._nome = nome;
	}

	public String GetNome() {
		return this._nome;
	}

	public void SetSituacao(String situacao) {
		this._situacao = situacao;
	}

	public String GetSituacao() {
		return this._situacao;
	}

	public void SetEquipe(Clube equipe) {
		this._equipe = equipe;
	}

	public Clube GetEquipe() {
		return this._equipe;
	}

	public void SetSalario(double salario) {
		this._salario = salario;
	}

	public double GetSalario() {
		return this._salario;
	}
}
