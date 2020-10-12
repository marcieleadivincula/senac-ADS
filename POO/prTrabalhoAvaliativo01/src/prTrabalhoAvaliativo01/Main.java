package prTrabalhoAvaliativo01;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Escreva um programa Java orientado a objetos que leia o nome, situação (Titular ou Reserva), equipe (clube) e o salário de cada jogador (até que nome seja “fim”) e imprima o nome, salário atual e novo salário.
		//1.total dos salários atuais e dos novos salários;2.nome, salário atual e novo salário do jogador com menor salário atual;3.participação  percentual  dos  novos  salários  dos  titulares  e  dos  reservas  sobre  o  total  de  novos salários.
		//2.nome, salário atual e novo salário do jogador com menor salário atual;3.participação  percentual  dos  novos  salários  dos  titulares  e  dos  reservas  sobre  o  total  de  novos salários.
		//3.participação  percentual  dos  novos  salários  dos  titulares  e  dos  reservas  sobre  o  total  de  novos salários.
		//4.nome,  salário  atual  e  novo  salário  dos  jogadores  com  novo  salário  acima  da  média  de  novos salários.
		//5.dados de todos os clubes: 
			//5.1.nome do clube e cidade-sede;
			//5.2.média salarial; 
			//e 5.3.quantidade de jogadores.
		
		ServiceJogador srv = new ServiceJogador();
		Jogador jogador;
		
		String situacao;
		String equipe;
		String salario;
		String nome = JOptionPane.showInputDialog("Nome do jogador ou fim para sair");

		while (!nome.equalsIgnoreCase("fim")) {
			jogador = new Jogador();
			
			jogador.SetSituacao(JOptionPane.showInputDialog("Insira a situação do jogador"));
			equipe = JOptionPane.showInputDialog("Insira a equipe");
			//jogador.SetEquipe(equipe);
			jogador.SetSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o salário do jogador")));
			
			situacao = JOptionPane.showInputDialog("Insira a situação do jogador");

			while(!situacao.equalsIgnoreCase("fim")) {
				
			}
			
			srv.SetListaJogadores(jogador);
			
			jogador.SetNome(JOptionPane.showInputDialog("Nome do jogador ou fim para sair"));
		}
		
		JOptionPane.showMessageDialog(null, srv.toString());

	}

}
