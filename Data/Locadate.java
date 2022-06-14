package Data;

import java.time.LocalDate;
import java.util.Scanner;

public class Locadate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		teste4 Julio = new teste4(null, null);

		System.out.println("informe nome: ");
		Julio.nome = input.next();
		try {
			System.out.println("Informe sua data de Nacimento: ");
			Julio.dn = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
			System.out.println(Julio.dn.isLeapYear());
			

		} catch (Exception e) {
			System.out.println("Mes Invalido");
			input.close();
		}
	}
}
