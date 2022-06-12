import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class HelloWord {
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 int Idade = 0;
		 String Nome = null;
		 
		 for(int i = 0; i < 2; i++) {
			 System.out.println("Escreva Sua Nome");
			 Nome = teclado.next();
			}System.out.println("Escreva Seu Idade");
			Idade = teclado.nextInt();
			
			
			if(Idade >0) {
				System.out.println("Seu nome" + Nome + "Sua Idade"+ Idade);
			}
		  	teclado.close();
		 }
	}


