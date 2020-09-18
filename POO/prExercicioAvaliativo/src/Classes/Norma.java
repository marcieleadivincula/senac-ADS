package Classes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Norma {
	private String tituloNorma;
	private String dataCriacaoNorma;
	private String orgaoNormativo;
	private String versao;
	private ArrayList<AnexoTecnico> listaAnexo = new ArrayList<AnexoTecnico>();

	@Override
	public String toString() {
		String resultado = "\nTítulo da norma: " + getTituloNorma() + "\nData da criação: " + getDataCriacaoNorma() + "\nOrgão Normativo: "
				+ getOrgaoNormativo() + "\nVersão: " + getVersao();

		for (AnexoTecnico anexo : listaAnexo) {
			resultado += anexo.toString();
		}
		return resultado;
	}

	public void addAnexo(AnexoTecnico anexo) {
		this.listaAnexo.add(anexo);
	}

	public int getQtdeAnexoTecnico() {
		return this.listaAnexo.size();
	}
	
	/*
	 * public String getNormaAntiga(String dataCriacaoNorma) {
	 * 
	 * String resultado = "\nTítulo da norma: " + getTituloNorma() + "\nData da criação: " + getDataCriacaoNorma() + "\nOrgão Normativo: "
				+ getOrgaoNormativo() + "\nVersão: " + getVersao();

		for (Norma norma : listaNormas) {
			resultado += norma.toString();
		}
		return resultado;
		
	    String antiga = dataCriacaoNorma, atual = dataCriacaoNorma;
		
			if (dataCriacaoNorma > maior) {
				maior = dataCriacaoNorma;
			}
			
			if (dataCriacaoNorma < menor) {
				menor = dataCriacaoNorma;
			}
			
			return maior;
	 * }
	 */
	
	// Construtor sem parâmetros
	public Norma() {

	}

	// Construtor com parâmetros
	public Norma(String tituloNorma, String dataCriacaoNorma, String orgaoNormativo, String versao,
			ArrayList<AnexoTecnico> listaAnexo) {
		this.tituloNorma = tituloNorma;
		this.dataCriacaoNorma = dataCriacaoNorma;
		this.orgaoNormativo = orgaoNormativo;
		this.versao = versao;
		this.listaAnexo = listaAnexo;
	}

	// Métodos getters e setters
	public String getTituloNorma() {
		return tituloNorma;
	}

	public void setTituloNorma(String tituloNorma) {
		this.tituloNorma = tituloNorma;
	}

	public String getDataCriacaoNorma() {
		return dataCriacaoNorma;
	}

	public void setDataCriacaoNorma(String dataCriacaoNorma) {
		this.dataCriacaoNorma = dataCriacaoNorma;
	}

	public String getOrgaoNormativo() {
		return orgaoNormativo;
	}

	public void setOrgaoNormativo(String orgaoNormativo) {
		this.orgaoNormativo = orgaoNormativo;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public ArrayList<AnexoTecnico> getListaAnexo() {
		return listaAnexo;
	}

	public void setListaAnexo(ArrayList<AnexoTecnico> listaAnexo) {
		this.listaAnexo = listaAnexo;
	}

}
