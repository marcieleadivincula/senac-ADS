package prPessoas;

public class Pessoa {

	private int idade;
	private String sexo;

	// Construtor sem parāmetros
	public Pessoa() {

	}

	// construtor com parāmetros
	public Pessoa(int idade, String sexo) {
		this.setIdade(idade);
		this.setSexo(sexo);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
}
