package secao16;

import java.util.Scanner;

public class Programa38 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe o n1");
		int n1 = input.nextInt();
		System.out.println("informe o n2");
		int n2 = input.nextInt();
		try {
			System.out.println(divisao (n1,n2));
		} catch (Exception e) {
			System.out.println("Nao foi possivel a divisao");
			
		}
		input.close();
	}
	// estou criando uma função, que avisa que tem possibilidade 
	//de lançar um tipo de Exception
public static int divisao (int n1, int n2) throws Exception {
	return n1/n2;
}
}
