package Classes;

import java.util.ArrayList;

public class ServicoObra {
	ArrayList<Obra> listaObras = new ArrayList<Obra>();
	
	public void setListaObra(Obra obra) {
		this.listaObras.add(obra);
	}
	
	@Override
	public String toString() {
		String resultado = "Lista de obras\n";
		
		for(Obra obra: listaObras) {
			resultado += obra.toString() + "\n";	
		}
		
		return resultado;
	}
}
