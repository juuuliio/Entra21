package package13;

import java.util.Scanner;

public class Pizzaria {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		Pizza Baby = new Pizza(25, 25.99, null);
		Pizza Pequena = new Pizza(35, 29.99, null);
		Pizza Media = new Pizza(40, 39.99, null);
		Pizza Grande = new Pizza(55, 49.99, null);
		
		double teste = ( Baby.getTamnho() /Baby.getPreco() );
		double teste2 = (Pequena.getTamnho() /Pequena.getPreco() );
		double teste3 = (Media.getTamnho() / Media.getPreco());
		double teste4 = (Grande.getTamnho() / Grande.getPreco());
		if (teste > teste2 && teste > teste3 && teste > teste4) {
			System.out.println("Pizza que tem melhor custo é a Baby");
		}else if (teste2 > teste && teste2 > teste3 && teste2> teste4) {
			System.out.println("Pizza que tem melhor custo é a Pequena");
		}else if ( teste3 > teste && teste3 > teste2 && teste3 > teste4) {
			System.out.println("Pizza que tem melhor custo é a Media");
		}else if (teste4 > teste && teste4 > teste2 && teste4 > teste3) {
			System.out.println("Pizza que tem melhor custo é a Grande");
		}
		
		
		
		System.out.println("\rSabores: \r4 Queijos\r\n" + "6 Queijos\r\n" + "Alcatra\r\n" + "Alho e Óleo\r\n"
				+ "Americana\r\n" + "Brócolis com Bacon\r\n" + "");

		System.out.println("Escolha o tamnho Da Pizza \n" + 1 + " Para Pizza Baby \n" + 2 + " Para Pizza Pequena \n" + 3
				+ " Para Pizza Media \n" + 4 + " para Pizza Media \n" + 5 + " para Pizza Grande \n");
		int valor = Input.nextInt();
		switch (valor) {
		case 1:
			System.out.println("Escolha dois Sabor:");
			Baby.setSabor(Input.next());
			System.out.println("Sua Pizza é " + Baby.getSabor() + "O Valor de " + Baby.getPreco());
			break;
		case 2:
			System.out.println("Escolha TRES Sabor:");
			Pequena.setSabor(Input.next());
			System.out.println("Sua Pizza é " + Pequena.getSabor() + "O Valor de " + Pequena.getPreco());
			break;
		case 4:
			System.out.println("Escolha Quatro Sabor:");
			Media.setSabor(Input.next());
			System.out.println("Sua Pizza é " + Media.getSabor() + "O Valor de " + Media.getPreco());
			break;
		case 5:
			System.out.println("Escolha Quatro Sabor:");
			Grande.setSabor(Input.next());
			System.out.println("Sua Pizza é " + Grande.getSabor() + "O Valor de " + Grande.getPreco());
			break;
		default:
			System.out.println("tamnho Invalido !!! ");
			break;

		}
		Input.close();
	}
}
