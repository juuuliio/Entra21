package secao17;

import java.util.Scanner;

import package11.Cliente;
import package11.Conta;

/*
- gerando Executavis Java com Jar
- JAR java Archive
- 
- Archive arquivo compactado JAVA
-
-ZIP/RAR
 */
public class Principal {
	static Cliente cliente = new Cliente("Julio Cesar", "Rua anitapolis ");
	static Conta Conta = new Conta(1, 300, 400, cliente);
	static Scanner input = new Scanner(System.in);

	public static void Depositar() {
		System.out.println("===========Deposito==========");
		System.out.println("Informe o valor para Deposito");
		float valor = input.nextFloat();
		
		if (valor > 0) {
			Conta.Depositar(valor);
			System.out.println("Deposito efetuado Realizado com sucesso");
			;

		} else {
			System.out.println("Valor Invalido");
		}
	}

	public static void sacar() {
		System.out.println("==========Sacar==========");
		System.out.println("Informe o valor para Saque");
		float valor = input.nextFloat();
		if (valor > 0) {
			Conta.sacar(valor);
		} else {
			System.out.println("O valor precisa ser positivo");
		}
	}

	public static void consultar() {
		System.out.println("Seu Saldo é: " + Conta.getSaldo());
	}

	public static void main(String[] args) {
		int opcao = 0;
		System.out.println("bem Vindo Ao seu novo Banco");
		
		do {
			System.out.println("Selecione uma opção Abaixo: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - sacar");
			System.out.println("3 - Consutar Saldo");
			System.out.println("0 - Sair ");
			opcao = input.nextInt();
			
			switch (opcao) {
			
			case 1:
				Depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Invalida");
				break;
				
			}
			
		}while (opcao >0);
		input.close();
	}

}
