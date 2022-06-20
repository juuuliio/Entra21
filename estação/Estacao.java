package estação;


import java.util.Scanner;

public class Estacao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha 1 para Verão: ");
		System.out.println("Escolha 2 para Inverno: ");
		System.out.println("Escolha 3 para Outono: ");
		System.out.println("Escolha 4 para Primavera: ");
		int op = input.nextInt();
		
		switch (op) {
		case 1:
		Classes.getVerão();
			break;
		case 2:
			Classes.getInverno();
			break;
		case 3:
			Classes.getOutono();
			break;
		case 4 :
			Classes.getPrimavera();
			break;
		default:
			throw new Error("Numero inválido");
//			System.err.println("Numero Invalido");
//			break;
		}
		input.close();
	}

}
