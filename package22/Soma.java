package package22;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		int res;
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o Primero numero: ");
		int num1 = input.nextInt();
		System.out.println("Informe o Segungo numero: ");
		int num2 = input.nextInt();

		System.out.println("1 para Adi��o");
		System.out.println("2 para Subtra��o");
		System.out.println("3 para Multiplica��o");
		System.out.println("4 para Divis�o");
		int opcao = input.nextInt();

		switch (opcao) {
		case 1:
			res = num1 + num2;
			System.out.println("Resultado " + res);

			break;
		case 2:
			res = num1 - num2;
			System.out.println("Resultado " + res);
			break;
		case 3:
			res = num1 * num2;
			System.out.println("Resultado " + res);
			break;
		case 4:
			res = num1 / num2;
			System.out.println("Resultado " + res);
			break;

		default:
			System.err.println("Op��o Invalida");
			break;
		}
		input.close();
	}

}
