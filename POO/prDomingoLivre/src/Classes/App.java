package Classes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServiceEmpresa service = new ServiceEmpresa();

		System.out.println("Digite o codigo da empresa");
		String codigoEmpresa = sc.next();
		while (!codigoEmpresa.toUpperCase().equals("ZZ")) {
			System.out.println("Digite a quantidade total de pessoas");
			int quantidadeDePessoas = sc.nextInt();
			System.out.println("Digite a quantidade total de Onibus");
			int quantidadeDeOnibus = sc.nextInt();
			Empresa empresa = new Empresa(codigoEmpresa, quantidadeDeOnibus, quantidadeDePessoas);
			service.addEmpresa(empresa);
			service.defineValorPassagem(empresa);
			System.out.println("O valor total a pagar para a empresa " + empresa.getCodigoEmpresa() + " é: "
					+ service.valorTotalPagar(empresa));
			System.out.println("a media de pessoas transportadas por onibus da empresa " + empresa.getCodigoEmpresa()
					+ " é: " + service.mediaPorOnibus(empresa));
			System.out.println("Digite o codigo da empresa");
			codigoEmpresa = sc.next();
		}

		System.out.println(service.mediaPorDomingo());
		service.valorTotalPessoasPorFaixaDeValor();
	}

}
