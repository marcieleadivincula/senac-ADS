package Classes;

import java.util.ArrayList;

public class ServicoVeiculo {
	ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

	public void setListaVeiculos(Veiculo veiculo) {
		this.listaVeiculos.add(veiculo);
	}

	// Quantidade de veículos com mais de 10 anos de circulação
	public int getqtdeVeiculoDezAnosOuMais(int anos) {
		int qtde = 0;
		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getIdade() > anos) {
				qtde++;
			}
		}
		return qtde;
	}

	// Quantidade de veículos com mais de 20 anos de circulação
	public int getQtdeVeiculoVinteAnosOuMais(int anos) {
		int qtde = 0;
		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getIdade() > anos) {
				qtde++;
			}
		}
		return qtde;
	}

	// Percentual de veículos com menos de 05 anos de circulação em relação ao total
	// de veículos
	public int getQtdeVeiculoPercentualMenosCincoAnos(int anos) {
		int qtde = 0;
		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getIdade() < anos) {
				qtde++;
			}
		}
		return qtde;
	}

	// Quantidade de veículos cor branca e montadora FIAT
	public int getQtdeVeiculoCorBrancaEMontadoraFiat(String cor, String montadora) {
		int qtde = 0;
		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getCor().equalsIgnoreCase(cor)
					&& listaVeiculos.get(i).getMontadora().equalsIgnoreCase(montadora)) {
				qtde++;
			}
		}
		return qtde;
	}

	// variable = (condition) ? expressionTrue : expressionFalse;
	// Percentual de veículos com motor 1.0 da montadora Reanult cuja cor seja Prata
	// e o ano superior 1995
	public int getQtdeVeiculoMotorUmRenaultPrataAno(String motor, String montadora, String cor, int ano) {
		int qtde = 0;
		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getMotor().equalsIgnoreCase(motor)
					&& listaVeiculos.get(i).getMontadora().equalsIgnoreCase(montadora)
					&& listaVeiculos.get(i).getCor().equalsIgnoreCase(cor) && listaVeiculos.get(i).getAno() > ano) {
				qtde++;
			}
		}
		return qtde;
	}

	//// Lista com todos os veículos cuja primeira letra da placa seja vogal e o
	//// último número da placa seja par
	public String getListaVeiculoPrimeiraLetraVogalEUltimoNumeroPar(String placa) {
		String resultado = "";
		for (int i = 0; i < listaVeiculos.size(); i++) {
			for (int j = 0; j < listaVeiculos.size(); j++) {
				listaVeiculos.lastIndexOf(placa);
			}
			
			if ((listaVeiculos.get(i).getPlaca().charAt(0) == 'A' || listaVeiculos.get(i).getPlaca().charAt(0) == 'A'
					|| listaVeiculos.get(i).getPlaca().charAt(0) == 'E'
					|| listaVeiculos.get(i).getPlaca().charAt(0) == 'I'
					|| listaVeiculos.get(i).getPlaca().charAt(0) == 'O'
					|| listaVeiculos.get(i).getPlaca().charAt(0) == 'U')
					&& (listaVeiculos.get(i).getPlaca().lastIndexOf(placa) % 2 == 0)) {
				resultado = placa;
			}
		}
		return resultado;
	}
	
	public boolean EhVogal(String texto) {
		String resultado = "";
		return resultado.equalsIgnoreCase(texto);
	}

	public boolean EhConsoante(String texto) {
		String resultado = "";
		return resultado.equalsIgnoreCase(texto);
	}

	public boolean EhPar(int numero) {
		return numero % 2 == 0;
	}

	public boolean EhImpar(int numero) {
		return numero % 2 == 1;
	}

	// Informar na placa a palavra FIM
	public int setFimPlaca(String placa) {
		int qtde = 0;
		for (int i = 0; i < listaVeiculos.size(); i++) {
			if (listaVeiculos.get(i).getPlaca().equalsIgnoreCase(placa).concat(placa + " FIM")) {
				qtde++;
			}
		}
		return qtde;
	}

	@Override
	public String toString() {
		return "Quantidade de veículos da cidade = " + listaVeiculos.size()
				+ "Quantidade de veículos com mais de 10 anos = " + getqtdeVeiculoDezAnosOuMais(10)
				+ "Quantidade de veículos com mais de 20 anos = " + getQtdeVeiculoVinteAnosOuMais(20)
				+ "Percentual de veículos com menos de 5 anos = " + getQtdeVeiculoPercentualMenosCincoAnos(5)
				+ "Quantidade de veículos cor branca e montadora FIAT = "
				+ getQtdeVeiculoCorBrancaEMontadoraFiat("branca", "fiat")
				+ "Percentual de veículos com motor 1.0 da montadora Renault cujo cor seja prata e ano superior 1995 = "
				+ getQtdeVeiculoMotorUmRenaultPrataAno("1.0", "renault", "prata", 1995)
				+ "Lista com todos os veículos cuja primeira letra da placa seja vogal e ultimo número seja par = "
				+ getListaVeiculoPrimeiraLetraVogalEUltimoNumeroPar("AKL1546") + "Informar na placa a palavra FIM = "
				+ setFimPlaca("LMD7896");
	}
}
