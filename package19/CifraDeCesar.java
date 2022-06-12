package package19;

import java.util.Scanner;

public class CifraDeCesar {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String a,b,c;
		int teste;
		
		System.out.println("Informe o texto: ");
		a =input.next();
		System.out.println("Informe o Valor de Cifra: ");
		teste=input.nextInt();
		
		b=Codifica(a,teste);
		c=Descodifica(a,teste);
		
		System.out.println("texto Codificado: "+b);
		System.out.println("Texto Descodificado: "+a);
		
		
		input.close();
	}
	public static String Codifica(String a, int teste) {
		int i,n=a.length();
		String texto="";
		for(i=0;i<n; i++) {
			texto+=(char)(a.charAt(i)+teste);
		}
		return(texto);
	}public static String Descodifica(String a, int teste) {
		int i,n=a.length();
		String texto="";
		for(i=0;i<n; i++) {
			texto+=(char)(a.charAt(i)-teste);
		}
		return(texto);
		
		
	}

}
