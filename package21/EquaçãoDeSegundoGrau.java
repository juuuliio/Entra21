package package21;

import java.util.Scanner;

public class EquaçãoDeSegundoGrau {

	public static void Main(String[] args) {
		Scanner input = new Scanner (System.in);
		
        double a, b, c, delta, x1, x2;
        System.out.println("Digite o valor de a: ");
        a= input.nextInt();
        
        System.out.println("Digite o valor de b: ");
        b =  input.nextInt();
        System.out.println("Digite o valor de c: ");
        c =  input.nextInt();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
        	System.out.println("Não há raízes reais");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("A única raiz é: " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: " + x1 + " e " + x2);
            
            
        }
    input.close();
	}
	
}
