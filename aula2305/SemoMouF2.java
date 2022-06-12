package aula2305;

import java.util.Scanner;

public class SemoMouF2 {
	SemoMouF SemoMouF2;
	
	static Scanner input = new Scanner(System.in);
	public void cadastrar_Dados(){

			System.out.println("informe o nome; ");
			SemoMouF.nome = input.next();
			System.out.println("Informe sua Data de nacimento: ");
			SemoMouF.DN = input.nextDouble();
			System.out.println("Informe seu estado estadoCivil");
			SemoMouF.estadoCivil = input.next();
			System.out.println("Informe seu sexo: ");
			
			
	}
}
