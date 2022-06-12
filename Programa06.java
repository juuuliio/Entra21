import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;

		System.out.println("Escolha um numero");
		numero = input.nextInt();
		switch (numero) {
		case 1:
			System.out.println("O numero é  1");
			break;
		case 2:
			System.out.println("O numero é 2");
			break;
		case 3:
			System.out.println("O numero é 3");
			break;
		default:
			System.out.println("O numero é " + numero);
			break;
		}
		input.close();
	}
}
