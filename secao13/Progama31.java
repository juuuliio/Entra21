package secao13;

import package12.Aluno;


//classes Abstratas

/*
 * é um recurso que proporciona um bloquie na criação de Objetos
 * nao Conseguimos intaciar objetos de uma classe abstract;
 */

public class Progama31 {

	public static void main(String[] args) {
		Aluno Maria = new Aluno("Maria Silva", "1995", "1234567", "Maria@gmail.com");
		System.out.println(Maria);
		Maria.outra_Mensagem("Meu nome é Maria da Silva");
	}

}
