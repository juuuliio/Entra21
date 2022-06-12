package package21;

import java.util.Scanner;

public class EquaçãoDeSegundoGrauBruteforce {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor de a: ");
		double a = input.nextDouble();
		System.out.println("Digite o valor de b: ");
		double b = input.nextDouble();
		System.out.println("Digite o valor de c: ");
		double c = input.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		
	input.close();
	}

}
