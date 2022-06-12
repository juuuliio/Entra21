package package17;

import java.time.LocalDate;


public class Pessoa {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Dados pessoa1 = new Dados(LocalDate.of(1995, 6, 4), "Julio Cesar Adao", "M");
		Dados pessoa2 = new Dados(LocalDate.of(1995, 5, 30), "Helena Talyta", "F");
		Dados Pessoa3 = new Dados(LocalDate.of(1964, 5, 12), "Antonio", "M");
	}

}
