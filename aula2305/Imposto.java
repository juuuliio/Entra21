package aula2305;

import java.util.Scanner;

/*
 * Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS, PR e SC) e RENDA ANUAL.
 */
public class Imposto {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		// RECEBE OS DADOS
		
		Cliente Cliente1 = new Cliente();
		System.out.println("Informe Seu Nome ");
		Cliente1.Nome = Input.next();
		System.out.println("Informe Seu CPF: ");
		Cliente1.CPF = Input.next();
		System.out.println("Informe sua Renda: ");
		Cliente1.Renda = Input.nextDouble();
		System.out.println("Informe seu Estado: ");
		Cliente1.UF = Input.next();
		// System.out.println(Cliente1.Nome);

		Cliente Cliente2 = new Cliente();
		System.out.println("Informe Seu Nome ");
		Cliente2.Nome = Input.next();
		System.out.println("Informe Seu CPF: ");
		Cliente2.CPF = Input.next();
		System.out.println("Informe sua Renda: ");
		Cliente2.Renda = Input.nextDouble();
		System.out.println("Informe seu Estado: ");
		Cliente2.UF = Input.next();
		// System.out.println(Cliente2.Nome);
		Cliente Cliente3 = new Cliente();
		System.out.println("Informe Seu Nome ");
		Cliente3.Nome = Input.next();
		System.out.println("Informe Seu CPF: ");
		Cliente3.CPF = Input.next();
		System.out.println("Informe sua Renda: ");
		Cliente3.Renda = Input.nextDouble();
		System.out.println("Informe seu Estado: ");
		Cliente3.UF = Input.next();

		Cliente Cliente4 = new Cliente();
		System.out.println("Informe Seu Nome ");
		Cliente4.Nome = Input.next();
		System.out.println("Informe Seu CPF: ");
		Cliente4.CPF = Input.next();
		System.out.println("Informe sua Renda: ");
		Cliente4.Renda = Input.nextDouble();
		System.out.println("Informe seu Estado: ");
		Cliente4.UF = Input.next();
		
		
		/// IMPRESSAO DOS DADOS
		
		if (Cliente1.Renda <= 4000) {
			System.out.println("Se Deu Bem");
		} else if (Cliente1.Renda >= 4001 && Cliente1.Renda <= 9000) {
			Cliente1.Salario = Cliente1.Renda * 5.8;
			System.out.println(Cliente1.Salario);
		} else if (Cliente1.Renda >= 9001 && Cliente1.Renda <= 25000) {
			Cliente1.Salario = Cliente1.Renda * 15;
			System.out.println("Seu Imposto " + Cliente1.Salario);
		} else if (Cliente1.Renda >= 25001 && Cliente1.Renda <= 35000) {
			Cliente1.Salario = Cliente1.Renda * 27.5;
			System.out.println("Seu Imposto " + Cliente1.Salario);
		} else if (Cliente1.Renda >= 35001) {
			Cliente1.Salario = Cliente1.Renda * 30;
			System.out.println("Seu Imposto " + Cliente1.Salario);
		}

		if (Cliente2.Renda <= 4000) {
			System.out.println("Se Deu Bem");
		} else if (Cliente2.Renda >= 4001 && Cliente2.Renda <= 9000) {
			Cliente2.Salario = Cliente2.Renda * 5.8;
			System.out.println(Cliente2.Salario);
		} else if (Cliente2.Renda >= 9001 && Cliente2.Renda <= 25000) {
			Cliente2.Salario = Cliente2.Renda * 15;
			System.out.println("Seu Imposto " + Cliente2.Salario);
		} else if (Cliente2.Renda >= 25001 && Cliente2.Renda <= 35000) {
			Cliente2.Salario = Cliente2.Renda * 27.5;
			System.out.println("Seu Imposto " + Cliente2.Salario);
		} else if (Cliente2.Renda >= 35001) {
			Cliente2.Salario = Cliente2.Renda * 30;
			System.out.println("Seu Imposto " + Cliente2.Salario);
		}
		if (Cliente3.Renda <= 4000) {
			System.out.println("Se Deu Bem");
		} else if (Cliente3.Renda >= 4001 && Cliente3.Renda <= 9000) {
			Cliente3.Salario = Cliente3.Renda * 5.8;
			System.out.println(Cliente3.Salario);
		} else if (Cliente3.Renda >= 9001 && Cliente3.Renda <= 25000) {
			Cliente3.Salario = Cliente3.Renda * 15;
			System.out.println("Seu Imposto " + Cliente3.Salario);
		} else if (Cliente3.Renda >= 25001 && Cliente3.Renda <= 35000) {
			Cliente3.Salario = Cliente3.Renda * 27.5;
			System.out.println("Seu Imposto " + Cliente3.Salario);
		} else if (Cliente3.Renda >= 35001) {
			Cliente3.Salario = Cliente3.Renda * 30;
			System.out.println("Seu Imposto " + Cliente3.Salario);
		}
		if (Cliente4.Renda <= 4000) {
			System.out.println("Se Deu Bem");
		} else if (Cliente4.Renda >= 4001 && Cliente4.Renda <= 9000) {
			Cliente4.Salario = Cliente4.Renda * 5.8;
			System.out.println(Cliente4.Salario);
		} else if (Cliente4.Renda >= 9001 && Cliente4.Renda <= 25000) {
			Cliente4.Salario = Cliente4.Renda * 15;
			System.out.println("Seu Imposto " + Cliente4.Salario);
		} else if (Cliente4.Renda >= 25001 && Cliente4.Renda <= 35000) {
			Cliente4.Salario = Cliente4.Renda * 27.5;
			System.out.println("Seu Imposto " + Cliente4.Salario);
		} else if (Cliente4.Renda >= 35001) {
			Cliente4.Salario = Cliente4.Renda * 30;
			System.out.println("Seu Imposto " + Cliente4.Salario);
		}

		/*
		 * boolean salario = 0 < 4000 * 0; boolean salario1 = 4.001 < 9.000 * 5.8;
		 * boolean salario2 = 9.001 < 25.000 * 15; boolean salario3 = 25.001 < 35.000 *
		 * 27.5; double salario4 = (35.001) * 30;
		 */

		Input.close();
	}

}
