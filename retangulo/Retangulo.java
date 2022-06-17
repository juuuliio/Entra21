package retangulo;

import java.util.Scanner;

public class Retangulo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input =new  Scanner (System.in);
		int a,b;
		System.out.println("Informe o Primeiro lado");
		a = input.nextInt();
		System.out.println("Informe o Segundo Lado");
		b = input.nextInt();
		int res = a+a+b+b;
		if (a+b <= 0){
			throw new IllegalArgumentException("Numero Invalido");
		
		}System.out.println("Perimetro do Retangulo é:"+res);
		input.close();
		
	}

}
