import java.util.Scanner;

// opraçoes matematicas
public class Programa14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, res;
		float res2;

		System.out.println("escolha um numero");
		num1 = input.nextInt();
		System.out.println("Escolha um numero");
		num2 = input.nextInt();
		// soma
		res = num1 + num1;

		System.out.println("a soma de " + num1 + " + " + num2 + " é " + res);
		// subtração
		res = num2 - num1;
		System.out.println("A subtração de " + num2 + " - " + num1 + " é " + res);
		// Multiplicação
		res = num1 * num2;
		System.out.println("A Multiplicação de " + num1 + " * " + num2 + " é " + res);
		// Divisao (Divisao Inteira)
		res = num1 / num2;
		System.out.println("A Divisao " + num1 + " / " + num2 + " é " + res);

		// Divisao (Divisao com float)
		res2 = (float)num1 / (float)num2;  //cast
		System.out.println("A Divisao " + num1 + " / " + num2 + " é " + res2);

		// Modulo
		/*
		 * Se 0 considerar PAR se 1 considerar Impar
		 */
		res=num1%2;
		System.out.println("O Resto de Divisao"+ num1+" Por 2 é"+res);
		
		input.close();
	}

}
