import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		// INICIALIZANDO O SCANNER
		Scanner input = new Scanner(System.in);
		// DECLARANDO E INICIALIZANDO A VARIALVEL
		int numero = 0;
		// PERGUNTA PARA INSERIR O NUMERO DO INT
		System.out.println("escolha Uma Numero");
		numero = input.nextInt();
		// SE
		if (numero > 5) {
			System.out.println("O " + numero + " � maior que 5");
			// SE NAO
		} else if (numero == 5) {
			System.out.println("o " + numero + "� igual ao mesmo");
			// verificao se o numero � par
		} else if (numero % 2 == 0) {
			System.out.println("O " + numero + " � par r");
		} else {
			System.out.println("O " + numero + " � menor que 5");
		}
	}

}
