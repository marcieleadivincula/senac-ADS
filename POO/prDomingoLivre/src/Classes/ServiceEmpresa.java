package Classes;

import java.util.ArrayList;

public class ServiceEmpresa {
	ArrayList<Empresa> listaDeEmpresas = new ArrayList<Empresa>();

	public void addEmpresa(Empresa empresa) {
		listaDeEmpresas.add(empresa);
	}

	public Empresa getEmpresaByCodigo(String codigoEmpresa) {
		for (Empresa e : listaDeEmpresas) {
			if (e.getCodigoEmpresa().toUpperCase().equals(codigoEmpresa)) {
				return e;
			}
		}
		return null;
	}
}
