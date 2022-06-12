//construtor
/*
 * o contrutor de uma classe SEMPRE tem mesmo nome da Classe
 * Por padrao a JVM - cria em tem de execusao 
 * cira em tempo de um construtor padrao - um construtor vazio
 * pedemos ter mais de um construtor na Classe
 * 
 */
public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();// (Método) construtor
		pessoa1.nome = "julio cesar";
		pessoa1.email = "Julio_adao@hotmail.com";
		pessoa1.ano_nacimento = 1995;

		pessoa1.imprime_informacoes();

		Pessoa pessoa2 = new Pessoa("Julio Cesar", "Julio_adao@hotmail.com", 1995);
		pessoa2.imprime_informacoes();

	}

}
