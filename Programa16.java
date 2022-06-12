// Vetores Parte 2
public class Programa16 {

	public static void main(String[] args) {
		// Declaração e Definição de Tamaho do Vetor
		int numero[] = new int[10];
		System.out.println("Tamaho do Vetor " + numero.length);

		for (int i = 0; i < numero.length; i++) {
			// numero[0] = i+3;
			numero[i] = i + 3;
			// numero[9]=i + 3;

		}
		System.out.println(numero[0]);// Imprime o Primeiro Elemento
		System.out.println(numero[9]);// Imprime o Ultimo Elemento
		// 0...9
		// numero[10]=42;
		// System.out.println(numero[10]);
		// os Vetores/ Array possuem valores fixos
		// nao podem ser aumentados / Diminudos

		/*
		 * numero[0] = 24.7; os Vetores/Array possuem valores fixos e nao aceitam tipos
		 * variados.
		 */

		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) Math.round(Math.random() * 10);
		}
		System.out.println(numero[0]);// Imprime o Primeiro Elemento
		System.out.println(numero[9]);// Imprime o Ultimo Elemento
		//0...1 double
		System.out.println(Math.random());
		System.out.println(Math.random() *10);
		System.out.println(Math.round(Math.random()*10 ));
		for (int i : numero) {
			System.out.println(i);
			
		}

	}

}
