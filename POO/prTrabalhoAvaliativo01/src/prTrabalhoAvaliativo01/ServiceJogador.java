package prTrabalhoAvaliativo01;

import java.util.ArrayList;

public class ServiceJogador {
	ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();

	@Override
	public String toString() {
		String resultado = "Lista de jogadores\n";

		for (Jogador jogador : listaJogadores) {
			resultado += jogador.toString() + "\n";
		}

		return resultado;
	}

	public void SetListaJogadores(Jogador jogador) {
		this.listaJogadores.add(jogador);
	}

	public double getTotalSalarioNovo() {
		double total = 0;

		for (Jogador j : listaJogadores) {
			total += j.getSalarioNovo();
		}
		return total;
	}

	public double getTotalSalarioAtual() {
		double total = 0;

		for (Jogador j : listaJogadores) {
			total += j.GetSalario();
		}
		return total;
	}

	public int getQtdeJogadores() {
		return this.listaJogadores.size();
	}

	public String getJogadorComMenorSalario() {
		if (this.listaJogadores.size() <= 0) {
			return "Não há jogadores cadastrados!";
		}

		Jogador j = listaJogadores.get(0);
		double menor = listaJogadores.get(0).GetSalario();

		for (Jogador jog : listaJogadores) {
			if (jog.GetSalario() < menor) {
				menor += jog.GetSalario();
				j = jog;
			}
		}
		return j.toString();
	}

	public double getValorSalarioBySituacao(int escala) {
		double total = 0;

		for (Jogador jog : listaJogadores) {
			if (escala == 1) {
				if (jog.GetSituacao().equalsIgnoreCase("titular")) {
					total += jog.getSalarioNovo();
				}
			} else {
				if (jog.GetSituacao().equalsIgnoreCase("reserva")) {
					total += jog.getSalarioNovo();
				}
			}
		}
		
		return total;
	}
	
	public double getPercentBySituacao(int escala) {
		return ((this.getValorSalarioBySituacao(escala)) * 100) / this.getTotalSalarioNovo();
	}
	
	public double getMediaSalariosNovos() {
		if (this.listaJogadores.size() <= 0) {
			return 0;
		}
		return this.getTotalSalarioNovo() / this.listaJogadores.size();
	}
	
	public String getJogadoresSalarioAcimaMedia() {
		String result = "";
		
		for (Jogador jog : listaJogadores) {
			if (jog.getSalarioNovo() > this.getMediaSalariosNovos()) {
				result += jog.toString();
			}
		}
		return result;
	}
}


