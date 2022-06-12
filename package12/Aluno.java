package package12;
/* Herança 
 * Evita a repetição de codigos
 * facilita a manutenção do Programa
 * 
 * Classe especifica 
 * sub Classe
 * clase filha
 */

public class Aluno extends Pessoa {

	private String ra;

	// Aluno é uma Pessoa
	/*
	 * - QUANDO UMA CLASSE HERDA DE OURTRA CLASSE GANHA TODOS ATRIBUTO E metodoS DA
	 * CLASSE HERDADA
	 */
	public Aluno(String nome, String ano_Nasc, String ra, String email) {
		super(nome, ano_Nasc, email);
		// Pessoa (nome,ano de nacimento
		this.ra = ra;

	}

	public String getRa() {
		return this.ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	// Overrinding// Overrinding
	public String toString() {
		return super.toString() + "\nRa: " + this.ra;
	}
	// Overrinding
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}

	@Override
	public void outra_Mensagem(String Texto) {
		System.out.println(Texto);
		
	}
}
