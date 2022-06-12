import java.util.Scanner;

public class Programa08 {
	public static void main(String[] args) {
		int Idade;

		Scanner teclado = new Scanner(System.in);
		// Primeiro Executa o bloco, depois faz a checagem
		do {
			System.out.println("Informe Seu Nome: ");
			String nome = teclado.nextLine();
			System.out.println("Informe Sua Idade: ");
			// idade = teclado.nextInt();*Esse jeito da Bug**
			Idade = Integer.parseInt(teclado.nextLine());
			if (Idade > 0) {
				System.out.println("Ola " + nome + ",Qual a sua Idade? " + Idade);
			}
		} while (Idade > 0);
		teclado.close();
	}
}
