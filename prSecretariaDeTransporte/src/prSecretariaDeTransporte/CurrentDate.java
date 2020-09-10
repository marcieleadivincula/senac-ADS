package prSecretariaDeTransporte;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class CurrentDate {
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		LocalDate dateNow = LocalDate.now();
		System.out.println(formatter.format(dateNow));
	}

}
