package prSecretariaDeTransporte;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class ServicoVeiculo {
	private ArrayList<Veiculos> listaVeiculos = new ArrayList<Veiculos>();

	public void setListaVeiculos(Veiculos veiculo) {
		this.listaVeiculos.add(veiculo);
	}



	// Quantidade de veículos na cidade
	public int getQtdVehicleByCity(String placa) {
		int qtde = 0;
		for (int i = 0; i < this.listaVeiculos.size(); i++) {
			if (this.listaVeiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
				qtde++;
			}
		}
		return qtde;
	}

	// Quantidade de veículos com mais de 10 anos
	public int getQtdVehicleTenYearOrMore(int ano) {
		int qtde = 0;
		prSecretariaDeTransporte.CurrentDate dataAtual = new CurrentDate();
		for (int i = 0; i < this.listaVeiculos.size(); i++) {
			if (this.listaVeiculos.get(i).getAno() > 0) {
				qtde++;
			}
		}
		return qtde;
	}

	// Quantidade de veículos com mais de 20 anos
	public double getQtdVehicleTwentyYearOrMore(int ano) {
		int qtde = 0;
		for (int i = 0; i < this.listaVeiculos.size(); i++) {
			if (this.listaVeiculos.get(i).getAno() > 0) {
				qtde++;
			}
		}
		return qtde;
	}

	// Percentual de veículos com menos de 5 anos
	public double getPercentualVehicleWithFiveYearLess(int ano) {
		int qtde = 0;
		for (int i = 0; i < this.listaVeiculos.size(); i++) {
			if (this.listaVeiculos.get(i).getAno() > 0) {
				qtde++;
			}
		}
		return qtde;
	}

	// Quantidade de veículos cor branca e montadora FIAT
	public double getQtdVehicleWhiteAndFiat(int ano) {
		int qtde = 0;
		for (int i = 0; i < this.listaVeiculos.size(); i++) {
			if (this.listaVeiculos.get(i).getAno() > 0) {
				qtde++;
			}
		}
		return qtde;
	}

	// Percentual de veículos motor 1.0 da montadora Renault, cor prata e o ano
	// superior 1995
	public double getPercentualVehicleMotorOneRenaultAndMore1995(int ano) {
		int qtde = 0;
		for (int i = 0; i < this.listaVeiculos.size(); i++) {
			if (this.listaVeiculos.get(i).getAno() > 0) {
				qtde++;
			}
		}
		return qtde;
	}

	// Lista com todos os veículos cujo a primeira letra da placa seja vogal e o
	// ultimo numero da placa seja par
	public double getListVehicleForFirstLetterVowelAndLastEvenNumberPlaca(int ano) {
		int qtde = 0;
		for (int i = 0; i < this.listaVeiculos.size(); i++) {
			double resultado = this.listaVeiculos.get(i).getAno();
			if (resultado > 0) {
				qtde++;
			}
		}
		return qtde;
	}

	//Informar na placa a palavra fim
	public double setWordEndOnPlate(String placa) {
		String palavra = "FIM";
		for(int i = 0; i < this.listaVeiculos.size(); i++) {
			String resultado = this.getQtdVehicleByCity(placa); 
			if (this.listaVeiculos.get(i).getPlaca().equalsIgnoreCase(placa)) {
				return (this.listaVeiculos.get(i).getPlaca() + " FIM");
			} else {
				return 0;
			}
		}
	}
	
	public void CurrentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		LocalDate dataAtual = LocalDate.now();
		System.out.println(formatter.format(dataAtual));
	}
	
	@Override
	public String toString() {
		return "Quantidade de veículos na cidade = " + this.getQtdVehicleByCity("Placa")
				+ "Quantidade de veículos com mais de 10 anos = " + this.getQtdVehicleTenYearOrMore("10 anos")
				+ "Quantidade de veículos com mais de 20 anos = " + this.getQtdVehicleTwentyYearOrMore("20 anos")
				+ "Percentual de veículos com menos de 5 anos = " + this.getPercentualVehicleWithFiveYearLess("5 anos")
				+ "Quantidade de veículos cor branca e montadora FIAT = " + this.getQtdVehicleWhiteAndFiat("Placa")
				+ "Percentual de veículos motor 1.0 da montadora Renault, cor prata e o ano superior 1995 = "
				+ this.getPercentualVehicleMotorOneRenaultAndMore1995("Placa")
				+ "Lista com todos os veículos cujo a primeira letra da placa seja vogal e o ultimo numero da placa seja par = "
				+ this.getListVehicleForFirstLetterVowelAndLastEvenNumberPlaca("Placa")
				+ "Informar na placa a palavra fim = " + this.setWordEndOnPlate("Fim");
	}
}
