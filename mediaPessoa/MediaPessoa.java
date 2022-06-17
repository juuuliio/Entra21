package mediaPessoa;

import java.util.Scanner;

public class MediaPessoa {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		  double media = 0;
		  for (int i = 0; i < 5; i++) {
		    System.out.println("Digite a altura da pessoa " + (i + 1));
		    media += Input.nextDouble();
		  }
		  media /= 5;
		  System.out.println("A média de altura das 5 pessoas é " + media);
		  Input.close();
	}

}
