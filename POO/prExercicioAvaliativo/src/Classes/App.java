package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ServicoNorma srvNorma = new ServicoNorma();
		Norma norma;
		AnexoTecnico anexoTecnico;
		String dataAnex, data;
		
		String tituloNorma = JOptionPane.showInputDialog("Insira o título da norma ou fim para sair");
		
		while (!tituloNorma.equalsIgnoreCase("fim")) {
			data = JOptionPane.showInputDialog("Insira a data de criação da norma");
			norma = new Norma();
			
			try {
				norma.setDataCriacaoNorma(sdf.parse(data));
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			norma.setOrgaoNormativo(JOptionPane.showInputDialog("Insira o orgão normativo"));
			norma.setVersao(JOptionPane.showInputDialog("Insira a versão da norma"));
	
			String tituloAnexo = JOptionPane.showInputDialog("Insira o título do anexo ou fim");

			while (!tituloAnexo.equalsIgnoreCase("fim")) {
				dataAnex = JOptionPane.showInputDialog("Insira a data de criação do anexo");
				anexoTecnico = new AnexoTecnico();
				
				anexoTecnico.setTema(JOptionPane.showInputDialog("Insira o tema do anexo"));
				try {
					anexoTecnico.setDataCriacaoAnexo(sdf.parse(dataAnex));
				} catch (ParseException e) {
					e.printStackTrace();
				}

				norma.addAnexo(anexoTecnico);
				
				anexoTecnico.setTituloAnexo(JOptionPane.showInputDialog("Insira o título do anexo ou fim"));
			}
			
			srvNorma.setListaNorma(norma);
			
			norma.setTituloNorma(JOptionPane.showInputDialog("Insira o título da obra ou fim para sair"));
		}
		
		JOptionPane.showMessageDialog(null, srvNorma.toString());

	}

}
