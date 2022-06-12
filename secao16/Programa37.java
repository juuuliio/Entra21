package secao16;

import java.util.Scanner;

public class Programa37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("informe o primenro numero para divisao: ");
		int num1 = input.nextInt();
		System.out.println("informe o segundo numero para divisao: ");
		int num2 = input.nextInt();
		try {
		System.out.println("A divisao de " + num1 + " por " + num2 + " é " + num1 / num2);
		}catch (Exception e) {
			System.out.println("Impossivel divisão por 0 tente novamente");
		}finally {
			System.out.println("continue o processo...");
		}
		input.close();
	
	}
}
