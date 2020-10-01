package prIRF;

import java.util.ArrayList;

public class ServiceContribuinte {
	private ArrayList<Contribuinte> listaContribuintes = new ArrayList<Contribuinte>();

	@Override
	public String toString() {
		String resultado = "Lista de contribuintes\n";

		for (Contribuinte contribuinte : listaContribuintes) {
			resultado += contribuinte.toString() + "\n";
		}

		return resultado;
	}

	public void setListaContribuinte(Contribuinte contribuinte) {
		listaContribuintes.add(contribuinte);
	}

	// pesquisa por CPF
	public String getContribuinteByCpf(String cpf) {
		for (Contribuinte contribuinte : listaContribuintes) {
			if (contribuinte.getCpf().equalsIgnoreCase(cpf)) {
				return contribuinte.toString();
			}
		}
		return "CPF não localizado!";
	}

	public String getContribuinteComMaiorValor() {
		double maior = 0;
		Contribuinte cMaior = listaContribuintes.get(0); // inicializa com o primeiro da lista

		for (Contribuinte contribuinte : listaContribuintes) {
			if (contribuinte.getRendaAnual() > maior) {
				maior = contribuinte.getRendaAnual();
				cMaior = contribuinte;
			}
		}

		return cMaior.toString();
	}

	public String getMenorContribuinteRS() {
		boolean achou = false;
		double menor = 0;
		Contribuinte cMenor = listaContribuintes.get(0); // inicializa com o primeiro da lista

		for (Contribuinte contribuinte : listaContribuintes) {
			if (contribuinte.getUf().equalsIgnoreCase("RS")) {
				menor = listaContribuintes.get(0).getRendaAnual();
				cMenor = listaContribuintes.get(0); // inicializa com o primeiro da lista
				achou = true;
				break;
			}
		}

		if (!achou) {
			return "Não há contruibuintes do RS";
		}

		for (Contribuinte contribuinte : listaContribuintes) {
			if ((contribuinte.getRendaAnual() < menor) && (contribuinte.getUf().equalsIgnoreCase("RS"))) {
				menor = contribuinte.getRendaAnual();
				cMenor = contribuinte;
			}
		}

		return cMenor.toString();
	}

	public double getTotalImpostoUF(String uf) {
		double valor = 0;
		for (Contribuinte contribuinte : listaContribuintes) {
			if (contribuinte.getUf().equalsIgnoreCase(uf)) {
				valor += contribuinte.getImpostoAPagar();
			}
		}
		return valor;
	}

	public double getValorRendaTotal() {
		double valor = 0;
		for (Contribuinte contribuinte : listaContribuintes) {
			valor += contribuinte.getImpostoAPagar();
		}
		return valor;
	}
	
	public double getPercentByUF(String uf) {
		try {
			double result = (getTotalImpostoUF(uf) / getValorRendaTotal()) * 100;
			return result;
		} catch (Exception e) {
			return 0;
		}
	}
}
