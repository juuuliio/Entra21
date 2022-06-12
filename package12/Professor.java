package package12;

public class Professor extends Pessoa {
	private String matricula;

	public Professor(String nome, String matricula, String ano_Nasc, String email) {
		super(nome, ano_Nasc, email);

		setMatricula(matricula);

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	// Overrinding
	public String toString() {
		return super.toString() + "\nmatricula: " + this.matricula;
	}
	// Overrinding
	public String getNome() {
		return "Professor: \n" + super.getNome();
	}

	@Override
	public void outra_Mensagem(String Texto) {
		System.out.println(Texto);
		
	}
}
