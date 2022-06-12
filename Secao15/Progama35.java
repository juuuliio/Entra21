package Secao15;
// metodos estatico

/*
 * um metodo estatico nao depende de uma instacias ada classe 
 * para ser utilizado
 * 
 * pode-se utilizar conforme:
 * nomedaclasse.metodo();
 */
public class Progama35 {

	public static void main(String[] args) {
		ContaB c1 = new ContaB("meu Cliente");
		System.out.println(c1.getCliente());
		System.out.println(c1.getNumero());
		System.out.println("A proxima ContaB: "+ ContaB.proxima_conta());
		

	}

}
