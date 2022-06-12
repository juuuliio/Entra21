package Secao15;

// Atribustos Istaticos
/*
- Atribustos Istaticos sao atricuto, onde os valores sao 
compartilhados entre instacias da classe

 para utilizar um atributo estatico, colocamos o nome da classe 
 junto ao atributo
 
 exemplo
 nomedaclasse.atributo;
 */
public class Programa34 {
	public static void main(String[] args) {
		ContaB c1 = new ContaB("julio Cesar");

		System.out.println(c1.getCliente());
		System.out.println("Conta: " + c1.getNumero());

		ContaB c2 = new ContaB("Talyta");

		System.out.println(c2.getCliente());
		System.out.println("Conta: " + c2.getNumero());

		System.out.println(ContaB.contador);
		System.out.println(ContaB.contador);

		System.out.println(ContaB.contador);
	}
}
