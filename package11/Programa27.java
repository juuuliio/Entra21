package package11;
// private
/*
 *privado a propia classe
 *
 * ou seja so temos acesso ao propio atributo ou metodo privado 
 * dentro da propia classe onde ele foi declarado
 */
public class Programa27 {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente ("Julio ", "rua Catarina Hoster 126");
		
		System.out.println("Nome "+ cl1.getNome());
		System.out.println("Endereço "+ cl1.getEndereco());
		cl1.dizer_oi();
		
		Cliente cl2 = new Cliente ("teste ","teste ");

		System.out.println("Nome "+ cl2.getNome());
		System.out.println("Endereço "+ cl2.getEndereco());
		cl2.dizer_oi();
		
	
	}

}
