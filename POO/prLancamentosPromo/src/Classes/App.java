package Classes;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		ServicoObra srvObra = new ServicoObra();
		Obra obra;
		String autor;
		String titulo = JOptionPane.showInputDialog("Título da obra ou fim para sair");

		while (!titulo.equalsIgnoreCase("fim")) {

			obra = new Obra();

			autor = JOptionPane.showInputDialog("Autor");

			String conteudo;
			LocalDate data;
			String parecerista = JOptionPane.showInputDialog("Parecerista");

			while (!parecerista.equalsIgnoreCase("fim")) {
				if (obra.getQtdeParecer() == 2) {
					JOptionPane.showMessageDialog(null, "Excedeu o limite máximo de pareceres");
					break;
				}
				
				data = LocalDate.now();  
				conteudo = JOptionPane.showInputDialog("Conteúdo");
				Parecer parecer = new Parecer(parecerista, data, conteudo);
				obra.setParecer(parecer);
				
				parecerista = JOptionPane.showInputDialog("Parecerista");
			}
			
			srvObra.setListaObra(obra);
			
			titulo = JOptionPane.showInputDialog("Título da obra ou fim para sair");
		}
		
		JOptionPane.showMessageDialog(null, srvObra.toString());
	}

}
