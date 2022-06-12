import java.util.Scanner;

//While 
public class Programa07 {

	public static void main(String[] args) {
		int Idade = 1;

		Scanner teclado = new Scanner(System.in);
		// Sempre checa o valor antes de executar o bloco
		while (Idade > 0) {
			System.out.println("Informe Seu Nome: ");
			String nome = teclado.nextLine();
			System.out.println("Informe Sua Idade: ");
			// idade = teclado.nextInt();*Esse jeito da Bug**
			Idade = Integer.parseInt(teclado.nextLine());

			System.out.println("Ola " + nome + ",Qual a sua Idade? " + Idade);
		}
		teclado.close();
	}

}
