package Classes;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		ServicoNorma srvNorma = new ServicoNorma();
		Norma norma;
		AnexoTecnico anexoTecnico;
		
		String tituloNorma = JOptionPane.showInputDialog("Insira o t�tulo da norma ou fim para sair");
		
		while (!tituloNorma.equalsIgnoreCase("fim")) {
			norma = new Norma();
			
			norma.setDataCriacaoNorma(JOptionPane.showInputDialog("Insira a data de cria��o da norma"));
			norma.setOrgaoNormativo(JOptionPane.showInputDialog("Insira o org�o normativo"));
			norma.setVersao(JOptionPane.showInputDialog("Insira a vers�o da norma"));
	
			String tituloAnexo = JOptionPane.showInputDialog("Insira o t�tulo do anexo ou fim");

			while (!tituloAnexo.equalsIgnoreCase("fim")) {
				anexoTecnico = new AnexoTecnico();
				
				anexoTecnico.setTema(JOptionPane.showInputDialog("Insira o tema do anexo"));
				anexoTecnico.setDataCriacaoAnexo(JOptionPane.showInputDialog("Insira a data de cria��o do anexo"));

				norma.addAnexo(anexoTecnico);
				
				anexoTecnico.setTituloAnexo(JOptionPane.showInputDialog("Insira o t�tulo do anexo ou fim"));
			}
			
			srvNorma.setListaNorma(norma);
			
			norma.setTituloNorma(JOptionPane.showInputDialog("Insira o t�tulo da obra ou fim para sair"));
		}
		
		JOptionPane.showMessageDialog(null, srvNorma.toString());

	}

}
