import java.util.Scanner;

// opra�oes matematicas
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

		System.out.println("a soma de " + num1 + " + " + num2 + " � " + res);
		// subtra��o
		res = num2 - num1;
		System.out.println("A subtra��o de " + num2 + " - " + num1 + " � " + res);
		// Multiplica��o
		res = num1 * num2;
		System.out.println("A Multiplica��o de " + num1 + " * " + num2 + " � " + res);
		// Divisao (Divisao Inteira)
		res = num1 / num2;
		System.out.println("A Divisao " + num1 + " / " + num2 + " � " + res);

		// Divisao (Divisao com float)
		res2 = (float)num1 / (float)num2;  //cast
		System.out.println("A Divisao " + num1 + " / " + num2 + " � " + res2);

		// Modulo
		/*
		 * Se 0 considerar PAR se 1 considerar Impar
		 */
		res=num1%2;
		System.out.println("O Resto de Divisao"+ num1+" Por 2 �"+res);
		
		input.close();
	}

}
