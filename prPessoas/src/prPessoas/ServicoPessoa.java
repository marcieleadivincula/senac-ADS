package prPessoas;

import java.util.ArrayList;

public class ServicoPessoa {
	// tipo lista de array <objeto> nomeDoArrayList = new lista de array
	private ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

	public void setListaPessoas(Pessoa pessoa) {
		this.listaPessoas.add(pessoa);
	}

	public int getQtdeSexo(String sexo) {
		int qtde = 0;
		for (int i = 0; i < this.listaPessoas.size(); i++) {
			if (this.listaPessoas.get(i).getSexo().equalsIgnoreCase(sexo)) {
				qtde++;
			}
		}
		return qtde;
	}

	public double getPercentualPeopleBySexo(String sexo) {
		double resultado = this.getQtdeSexo(sexo);
			if(resultado > 0) {
				return (resultado / this.listaPessoas.size()) * 100;
			}else {
				return 0;
			}	
	}
	
	@Override
	public String toString() {
		return "Percentual de pessoas Femininas = " + this.getPercentualPeopleBySexo("F") + 
				"\nPercentual de pessoas Masculinos = " + this.getPercentualPeopleBySexo("M");
	}
}
