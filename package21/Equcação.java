package package21;

import java.util.Scanner;

public class Equcação {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double x1 = 0;
		double x2 = 0;
		double delta = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a = input.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = input.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = input.nextDouble();

		delta = (b * b) - (4 * a * c);

		if (delta < 0) {
			System.out.println("Não existe raiz real");
		} else if (delta == 0) {
			x1 = -b / (2 * a);
			System.out.println("Existe apenas uma raiz real: " + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Existem duas raizes reais: " + x1 + " e " + x2);
		}
		input.close();
	}

}
