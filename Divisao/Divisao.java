package Divisao;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = Integer.max(1, 100);
		int num1 = Integer.min(100, 1);
		System.out.println("Informe o Primeiro Valor:  ");
		num = input.nextInt();
		System.out.println("Informe o Segundo Valor: ");
		num1 = input.nextInt();
		int res = num / num1;

		System.out.println("O Valor Da Divisao : " + res);
		input.close();
	}

}
