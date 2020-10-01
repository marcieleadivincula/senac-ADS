package prImpostoRenda;

import java.util.ArrayList;

public class ServicePessoa {
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public void addPessoa(Pessoa pessoa) {
		listaPessoas.add(pessoa);
	}
}
