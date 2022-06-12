//Classe
// atributos
//metodos
// Construtores

/*
 * sempre um contrutor vazio tem sempre a seguinte forma
 * 
 * public NomeDaClasse(){
 * }
 */


public class Pessoa {
	String nome, email;
	int ano_nacimento;
//construtor vazio
	public Pessoa() {}
	
	//contrutor com parametros
	public Pessoa(String nome, String email, int ano_nacimento) {
		// this == este objeto
		this.nome= nome;
		this.email=email;
		this.ano_nacimento=ano_nacimento;
		
		
	}void imprime_informacoes(){
		System.out.println("Nome " + this.nome);
		System.out.println("E-mail " + this.email);
		System.out.println("Ano de Nacimento " + this.ano_nacimento);
	}
}
