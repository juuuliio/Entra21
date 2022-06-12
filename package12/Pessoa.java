package package12;
/*
 *  Classe base 
 *  Classe mae
 *  Classe pai
 *  super Classe
 *  classe generica
 */
// Agora como classe abstract
// desta forma, imposibilitamps a criação de objetos desta Classe
// uma classe abstract pode ter atributo, metodo, metodo abstract
//metodo abstract 
// sao metodo que nao possuem implementação, possuem, apenas declaração, e ,obrigatoriamente, as classe qie erdarem 
// dessa com metodo abstract, precisa emplementar esses metodo
public abstract class Pessoa {
	private String nome;
	private String ano_Nasc;
	private String email;

	public Pessoa() {
	}

	public Pessoa(String nome, String ano_Nasc, String email) {
		this.nome = nome;
		this.ano_Nasc = ano_Nasc;
		this.email = email;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getAno_Nasc() {
		return this.ano_Nasc;
	}

	public void setAno_Nasc(String ano_Nasc) {
		this.ano_Nasc = ano_Nasc;
	}

	// Overrinding
	public String toString() {
		return "NOME Pessoa: " + this.nome + " \nAno Naciemto: " + this.ano_Nasc + "\nEmail: " + this.email;
	}

	// overloanding
	public void Mensagem() {
		System.out.println("Essa é minha Mensagem");
	}

	// overloanding
	public void Mensagem(String msg) {
		System.out.println(msg);
	}
	// desclarao de um metodo abstract
	public abstract void outra_Mensagem (String Texto);
		
	
}
