package Classes;

import java.time.LocalDate;

public class Parecer {
	private String parecerista;
	private LocalDate data;
	private String conteudo;

	@Override
	public String toString() {
		return "\nParecerista: " + getParecerista() + "\nData: " + getData() + "\nConteúdo: " + getConteudo();
	}

	// Construtor
	public Parecer(String parecerista, LocalDate data, String conteudo) {
		this.parecerista = parecerista;
		this.data = data;
		this.conteudo = conteudo;
	}

	// Métodos getters e setters
	public String getParecerista() {
		return parecerista;
	}

	public void setParecerista(String parecerista) {
		this.parecerista = parecerista;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
