package prTrabalhoAvaliativo01;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Escreva um programa Java orientado a objetos que leia o nome, situa��o (Titular ou Reserva), equipe (clube) e o sal�rio de cada jogador (at� que nome seja �fim�) e imprima o nome, sal�rio atual e novo sal�rio.
		//1.total dos sal�rios atuais e dos novos sal�rios;2.nome, sal�rio atual e novo sal�rio do jogador com menor sal�rio atual;3.participa��o  percentual  dos  novos  sal�rios  dos  titulares  e  dos  reservas  sobre  o  total  de  novos sal�rios.
		//2.nome, sal�rio atual e novo sal�rio do jogador com menor sal�rio atual;3.participa��o  percentual  dos  novos  sal�rios  dos  titulares  e  dos  reservas  sobre  o  total  de  novos sal�rios.
		//3.participa��o  percentual  dos  novos  sal�rios  dos  titulares  e  dos  reservas  sobre  o  total  de  novos sal�rios.
		//4.nome,  sal�rio  atual  e  novo  sal�rio  dos  jogadores  com  novo  sal�rio  acima  da  m�dia  de  novos sal�rios.
		//5.dados de todos os clubes: 
			//5.1.nome do clube e cidade-sede;
			//5.2.m�dia salarial; 
			//e 5.3.quantidade de jogadores.
		
		ServiceJogador srv = new ServiceJogador();
		Jogador jogador;
		
		String situacao;
		String equipe;
		String salario;
		String nome = JOptionPane.showInputDialog("Nome do jogador ou fim para sair");

		while (!nome.equalsIgnoreCase("fim")) {
			jogador = new Jogador();
			
			jogador.SetSituacao(JOptionPane.showInputDialog("Insira a situa��o do jogador"));
			equipe = JOptionPane.showInputDialog("Insira a equipe");
			//jogador.SetEquipe(equipe);
			jogador.SetSalario(Double.parseDouble(JOptionPane.showInputDialog("Insira o sal�rio do jogador")));
			
			situacao = JOptionPane.showInputDialog("Insira a situa��o do jogador");

			while(!situacao.equalsIgnoreCase("fim")) {
				
			}
			
			srv.SetListaJogadores(jogador);
			
			jogador.SetNome(JOptionPane.showInputDialog("Nome do jogador ou fim para sair"));
		}
		
		JOptionPane.showMessageDialog(null, srv.toString());

	}

}
