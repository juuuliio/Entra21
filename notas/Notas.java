package notas;

import java.util.Scanner;

public class Notas {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int nota1 = 0, nota2 = 0, nota3 = 0, media = 0;
		Scanner input = new Scanner(System.in);
		if (nota1+nota2+nota3 <0) {
		System.out.println("Informe a Primera Nota:");
		nota1= input.nextInt();
		System.out.println("Informa a Segunda Nota:");
		 nota2 = input.nextInt();
		System.out.println("Informe a Terceira Nota: ");
		 nota3 = input.nextInt();
		
		media = (nota1+nota2+nota3) /3;
		throw new IllegalArgumentException("Valor Invalido");
		
		}System.out.println("A Media é :"+media);
	input.close();
	}

}
