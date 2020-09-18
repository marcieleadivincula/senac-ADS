package Classes;

import java.util.Date;

public class AnexoTecnico {
	private String tituloAnexo;
	private Date dataCriacaoAnexo;
	private String tema;
	
	@Override
	public String toString() {
		return "\nTítulo: " + getTituloAnexo() + "\nData da criação: " + getDataCriacaoAnexo() + "\nTema: " + getTema();
	}

	// Construtor sem parâmetros
	public AnexoTecnico() {
		
	}
	
	// Construtor com parâmetros
	public AnexoTecnico(String tituloAnexo, Date dataCriacaoAnexo, String tema) {
		this.tituloAnexo = tituloAnexo;
		this.dataCriacaoAnexo = dataCriacaoAnexo;
		this.tema = tema;
	}
	
	// Métodos getters e setters
	public String getTituloAnexo() {
		return tituloAnexo;
	}
	public void setTituloAnexo(String tituloAnexo) {
		this.tituloAnexo = tituloAnexo;
	}
	public Date getDataCriacaoAnexo() {
		return dataCriacaoAnexo;
	}
	public void setDataCriacaoAnexo(Date dataCriacaoAnexo) {
		this.dataCriacaoAnexo = dataCriacaoAnexo;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
}
