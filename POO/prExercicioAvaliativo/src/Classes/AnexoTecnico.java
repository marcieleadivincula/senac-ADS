package Classes;

public class AnexoTecnico {
	private String tituloAnexo;
	private String dataCriacaoAnexo;
	private String tema;
	
	@Override
	public String toString() {
		return "\nTítulo: " + getTituloAnexo() + "\nData da criação: " + getDataCriacaoAnexo() + "\nTema: " + getTema();
	}

	// Construtor sem parâmetros
	public AnexoTecnico() {
		
	}
	
	// Construtor com parâmetros
	public AnexoTecnico(String tituloAnexo, String dataCriacaoAnexo, String tema) {
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
	public String getDataCriacaoAnexo() {
		return dataCriacaoAnexo;
	}
	public void setDataCriacaoAnexo(String dataCriacaoAnexo) {
		this.dataCriacaoAnexo = dataCriacaoAnexo;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
}
