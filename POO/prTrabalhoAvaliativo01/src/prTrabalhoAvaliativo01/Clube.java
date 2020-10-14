package prTrabalhoAvaliativo01;

public class Clube {
	private String _nome;
	private String _cidade;
	
	@Override
	public String toString() {
		return "\nClube: " + GetNome() + "\nCidade: " + GetCidade();
	}
	
	public void SetNome(String nome) {
		this._nome = nome;
	}
	
	public String GetNome() {
		return this._nome;
	}
	
	public void SetCidade(String cidade) {
		this._cidade = cidade;
	}
	
	public String GetCidade() {
		return this._cidade;
	}
}
