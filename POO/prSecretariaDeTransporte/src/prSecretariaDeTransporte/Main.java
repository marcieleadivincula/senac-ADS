package prSecretariaDeTransporte;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Veiculos veiculo;
		ServicoVeiculo servicoVeiculo = new ServicoVeiculo();
		int ano = 0;
		String motor;
		String chassi;
		String cor;
		String montadora;
		String placa = JOptionPane.showInputDialog("Placa ou N - sair");
		
		while(! placa.equalsIgnoreCase("n")) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Ano ou  - sair"));
			motor = JOptionPane.showInputDialog("Motor ou N - sair");
			cor = JOptionPane.showInputDialog("Cor ou N - sair");
			montadora = JOptionPane.showInputDialog("Montadora ou N - sair");
			
			veiculo = new Veiculos();
			//veiculo = new Veiculos(placa, ano, chassi, cor, montadora);
			
			servicoVeiculo.setListaVeiculos(veiculo);
			
			placa = JOptionPane.showInputDialog("Placa ou N - sair");
		}
		
		JOptionPane.showMessageDialog(null, servicoVeiculo.toString());

	}

}
