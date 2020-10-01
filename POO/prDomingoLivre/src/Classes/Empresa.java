package Classes;

import java.util.ArrayList;

public class Empresa {
	private String codigoEmpresa;
	private int totalOnibus;
	private ArrayList<Onibus> listaOnibus = new ArrayList<Onibus>();

	public Empresa() {
		
	}

	public Empresa(String codigoEmpresa, int totalOnibus) {
		this.codigoEmpresa = codigoEmpresa;
		this.totalOnibus = totalOnibus;
	}

	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public int getTotalOnibus() {
		return totalOnibus;
	}

	public void setTotalOnibus(int totalOnibus) {
		this.totalOnibus = totalOnibus;
	}
	
	public ArrayList<Onibus> getListaOnibus() {
		return this.listaOnibus;
	}

	public void setListaOnibus(ArrayList<Onibus> listaOnibus) {
		this.listaOnibus = listaOnibus;
	}
}
