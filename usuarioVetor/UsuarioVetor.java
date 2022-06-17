package usuarioVetor;

import java.util.Scanner;

public class UsuarioVetor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  int[] vetor = new int[10];
		  int indice;
		  System.out.println("Informe o indice do vetor: ");
		  indice = input.nextInt();
		  System.out.println("Informe o valor do vetor: ");
		  vetor[indice] = input.nextInt();
		  if (indice <=  0 ) {
			  throw new IllegalArgumentException("O Valor não pode ser 0 ou negativo");
		  }
		  for (int i = 0; i < vetor.length; i++) {
		    System.out.println(vetor[i]);
		  }
		input.close();  
	}

}
