package Classes;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ServicoVeiculo servicoveiculo = new ServicoVeiculo();
		Veiculo veiculo;
		
		int ano;
		String motor;
		String chassi;
		String cor;
		String montadora;
		String placa = JOptionPane.showInputDialog("Placa");
		
		while(!placa.equalsIgnoreCase("fim")) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
			motor = JOptionPane.showInputDialog("Motor");
			chassi = JOptionPane.showInputDialog("Chassi");
			cor = JOptionPane.showInputDialog("Cor");
			montadora = JOptionPane.showInputDialog("Montadora");
			veiculo = new Veiculo(placa, ano, motor, chassi, cor, montadora);
			
			servicoveiculo.setListaVeiculos(veiculo);
			placa = JOptionPane.showInputDialog("Placa");
		}
		
	}

}
