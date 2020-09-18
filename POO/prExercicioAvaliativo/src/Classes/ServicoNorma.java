package Classes;

import java.util.ArrayList;

public class ServicoNorma {
	ArrayList<Norma> listaNormas = new ArrayList<Norma>();

	public void setListaNorma(Norma norma) {
		this.listaNormas.add(norma);
	}

	@Override
	public String toString() {
		String resultado = "Lista de normas\n";

		for (Norma norma : listaNormas) {
			resultado += norma.toString() + "\n";
		}

		return resultado;
	}
}
