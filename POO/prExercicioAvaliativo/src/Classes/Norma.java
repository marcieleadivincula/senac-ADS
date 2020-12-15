package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Norma {
	private String tituloNorma;
	private Date dataCriacaoNorma;
	private String orgaoNormativo;
	private String versao;
	private ArrayList<AnexoTecnico> listaAnexo = new ArrayList<AnexoTecnico>();

	@Override
	public String toString() {
		String resultado = "\nTítulo da norma: " + getTituloNorma() + "\nData da criação: " + getDataCriacaoNorma()
				+ "\nOrgão Normativo: " + getOrgaoNormativo() + "\nVersão: " + getVersao();

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

	//Pega norma mais antiga (menor data de criação)
	/*
	 * public Date getNormaAntiga(Date dataCriacaoNorma) { Date dataInicial,
	 * dataFinal; String strDataInicial = "14/01/2017"; String strDataFinal =
	 * "15/01/2017";
	 * 
	 * SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	 * SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	 * 
	 * dataFinal = sdf1.parse(strDataFinal); dataInicial =
	 * sdf2.parse(strDataInicial);
	 * 
	 * System.out.println(dataInicial.compareTo(dataFinal));
	 * System.out.println(dataInicial.after(dataFinal));
	 * 
	 * Date MenorData = dataCriacaoNorma.getDataCriacaoNorma();
	 * 
	 * for (Norma norma : listaNormas) { if (dataCriacaoNorma < MenorData) {
	 * MenorData = dataCriacaoNorma; } } return MenorData; }
	 */

	// Construtor sem parâmetros
	public Norma() {

	}

	// Construtor com parâmetros
	public Norma(String tituloNorma, Date dataCriacaoNorma, String orgaoNormativo, String versao,
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

	public Date getDataCriacaoNorma() {
		return dataCriacaoNorma;
	}

	public void setDataCriacaoNorma(Date dataCriacaoNorma) {
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
