package prPessoas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa;
		ServicoPessoa servicoPessoa = new ServicoPessoa();
		int idade;
		String sexo = JOptionPane.showInputDialog("M - masculino / F- feminino / N - sair");
		
		while(! sexo.equalsIgnoreCase("n")) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			
			pessoa = new Pessoa(idade, sexo);
			
			servicoPessoa.setListaPessoas(pessoa);
			
			sexo = JOptionPane.showInputDialog("M - masculino / F- feminino / N - sair");
		}
		
		JOptionPane.showMessageDialog(null, servicoPessoa.toString());
	}

}
