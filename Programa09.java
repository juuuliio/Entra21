import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		int Idade;

		Scanner teclado = new Scanner(System.in);
		// variavel de controle; condição de parada; forma de Incremento
		//i++ ->i = i + 1
		for (int i = 0; i < 5; i++)
			System.out.println("Informe Seu Nome: ");
		String nome = teclado.nextLine();
		System.out.println("Informe Sua Idade: ");
		// idade = teclado.nextInt();*Esse jeito da Bug**
		Idade = Integer.parseInt(teclado.nextLine());
		if (Idade > 0) {
			System.out.println("Ola " + nome + ",Qual a sua Idade? " + Idade);
		}
		teclado.close();

	}

}
