// tipos de dados alfa numericos
//Characteres e Strings
public class Programa12 {

	public static void main(String[] args) {
		// tipos Primitivos
		char letra = 'a';// aspas simples
		char letra2 = 97; // 97 em decimal == 'a'
		// char letra4 = "b";errado
		letra2 = (char) (letra2 + 1);// cast
		System.out.println("letra " + letra);
		System.out.println("letra2 " + letra2);
		// tipos nao primitivos

		Character letra3 = 'A';
		String nome = "julio";
		System.out.println("letra3 " + letra3);
		System.out.println("Char/Character" + Character.SIZE + " bits");
		System.out.println("Valor minimo Char/Character" + Character.MIN_VALUE);
		System.out.println("Valor MAximo Char/Character" + Character.MAX_VALUE);
		System.out.println("nome " + nome);
		System.out.println("tamanho da String "+ nome.length());
		System.out.println("String " + (Character.SIZE * nome.length())+" bits");
	}

}
