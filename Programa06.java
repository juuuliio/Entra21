import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;

		System.out.println("Escolha um numero");
		numero = input.nextInt();
		switch (numero) {
		case 1:
			System.out.println("O numero �  1");
			break;
		case 2:
			System.out.println("O numero � 2");
			break;
		case 3:
			System.out.println("O numero � 3");
			break;
		default:
			System.out.println("O numero � " + numero);
			break;
		}
		input.close();
	}
}
