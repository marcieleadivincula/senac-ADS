package prIRF;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ServiceContribuinte srvContribuinte = new ServiceContribuinte();
		Contribuinte contribuinte;

		String nome = JOptionPane.showInputDialog("Insira o nome do contribuinte");
	
		while(!nome.equalsIgnoreCase("fim")) {
			contribuinte = new Contribuinte();
			
			String cpf = JOptionPane.showInputDialog("Insira o CPF");
			while (!cpf.equalsIgnoreCase("fim")) {
				contribuinte.setUf(JOptionPane.showInputDialog("Insira a UF"));
				contribuinte.setRendaAnual(Double.parseDouble(JOptionPane.showInputDialog("Insira a renda anual")));
				
				contribuinte.setCpf(JOptionPane.showInputDialog("Insira o CPF"));
			}
			srvContribuinte.setListaContribuinte(contribuinte);
			
			contribuinte.setNome(JOptionPane.showInputDialog("Insira o nome do contribuinte"));
		}

		JOptionPane.showMessageDialog(null, srvContribuinte.toString());
	}

}
