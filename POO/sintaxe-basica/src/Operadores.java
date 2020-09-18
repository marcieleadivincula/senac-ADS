import javax.swing.JOptionPane;

public class Operadores {

	public static void main(String[] args) {
		double nota1 = 10;
		double nota2 = 8.5;
		double nota3 = 5.5;
		double media = (nota1 + nota2 + nota3) / 3;

		if (media == 3.9) {
			System.out.println("Recuperação");
		} else if (media >= 6.0) {
			System.out.println("Aprovado");
		} else if (media <= 3.8) {
			System.out.println("Reprovado");
		}
		
		if (media != 6.0) {
			System.out.println("Reprovado");
		}
		
		
		double[] notas = new double[3];
		double mediaNotas = 0;
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Nota " + i));
			mediaNotas += notas[i];
				
			if (mediaNotas >= 4.9 && mediaNotas < 6.0) {
				System.out.println("Aluno recuperação");
			}else if (mediaNotas >= 6.0 ) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
		}
		
		//Como fazer ternário em JAVA
		//(expressão booleana) ? código 1 : código 2;
		System.out.println((mediaNotas >= 6.0) ? "Aprovado" : "Reprovado");
	}

}
