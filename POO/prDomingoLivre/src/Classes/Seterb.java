package Classes;

public class Seterb {
	private double valorPassagem;
	
	public void defineValorPassagem(Empresa e) {
		if (e.getQuantidadeTotalPessoas() <= 3000 && e.getQuantidadeTotalPessoas() > 0) {
			e.setValorPassagem(0.90);
		} else if (e.getQuantidadeTotalPessoas() > 3000 && e.getQuantidadeTotalPessoas() <= 8000) {
			e.setValorPassagem(0.87);
		} else if (e.getQuantidadeTotalPessoas() > 8000 && e.getQuantidadeTotalPessoas() <= 15000) {
			e.setValorPassagem(0.82);
		} else if (e.getQuantidadeTotalPessoas() > 15000 && e.getQuantidadeTotalPessoas() <= 35000) {
			e.setValorPassagem(0.76);
		} else if (e.getQuantidadeTotalPessoas() > 35000) {
			e.setValorPassagem(0.60);
		}
	}

	public void valorTotalPessoasPorFaixaDeValor() {
		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;
		int valor4 = 0;
		int valor5 = 0;

		for (Empresa e : listaDeEmpresas) {
			if (e.getValorPassagem() == 0.90) {
				valor1 += e.getQuantidadeTotalPessoas();
			} else if (e.getValorPassagem() == 0.87) {
				valor2 += e.getQuantidadeTotalPessoas();
			} else if (e.getValorPassagem() == 0.82) {
				valor3 += e.getQuantidadeTotalPessoas();
			} else if (e.getValorPassagem() == 0.76) {
				valor4 += e.getQuantidadeTotalPessoas();
			} else if (e.getValorPassagem() == 0.60) {
				valor5 += e.getQuantidadeTotalPessoas();
			}
		}
		System.out.println("Faixa de valor 0.90 teve a quantidade de passagens pagas: " + valor1 + " \n "
				+ "Faixa de valor 0.87 teve a quantidade de passagens pagas: " + valor2 + " \n "
				+ "Faixa de valor 0.82 teve a quantidade de passagens pagas: " + valor3 + " \n "
				+ "Faixa de valor 0.76 teve a quantidade de passagens pagas: " + valor4 + " \n "
				+ "Faixa de valor 0.60 teve a quantidade de passagens pagas: " + valor5 + " \n ");
	}
	
	public double valorTotalPagar(Empresa e) {
		return (double) e.getQuantidadeTotalPessoas() * e.getValorPassagem();
	}

	public double mediaPorOnibus(Empresa e) {
		return (double) e.getQuantidadeTotalPessoas() / (double) e.getTotalOnibus();
	}

	public double mediaPorDomingo() {
		int totalPessoasDomingo = 0;
		int totalOnibusDomingo = 0;

		for (Empresa e : listaDeEmpresas) {
			totalPessoasDomingo += e.getQuantidadeTotalPessoas();
			totalOnibusDomingo += e.getTotalOnibus();
		}
		return (double) totalPessoasDomingo / (double) totalOnibusDomingo;
	}

	public double getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}
}
