package Classes;

import java.util.ArrayList;

public class Obra {
	private String titulo;
	private String autor;
	private ArrayList<Parecer> pareceres = new ArrayList<Parecer>(); // agregação de pareceres

	@Override
	public String toString() {
		String resultado = "\nTítulo" + getTitulo() + "\nAutor: " + getAutor() + "\nPareceres: ";

		for (Parecer parecer : pareceres) {
			resultado += parecer.toString();
		}
		return resultado;
	}

	public void setParecer(Parecer parecer) {
		this.pareceres.add(parecer);
	}
	
	// Construtor sem parâmetros
		public Obra() {

		}


	// Construtor com parâmetros
	public Obra(String titulo, String autor, ArrayList<Parecer> pareceres) {
		this.titulo = titulo;
		this.autor = autor;
		this.pareceres = pareceres;
	}

	public int getQtdeParecer() {
		return this.pareceres.size();
	}
	
	// Métodos getters e setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public ArrayList<Parecer> getPareceres() {
		return pareceres;
	}

	public void setPareceres(ArrayList<Parecer> pareceres) {
		this.pareceres = pareceres;
	}

}
