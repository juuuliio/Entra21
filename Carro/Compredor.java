import java.time.LocalDate;

public class Compredor extends pessoa {
	int Salario;

	public Compredor(String nome, String cpf, LocalDate dn, String endereco, int salario) {
		super(nome, cpf, dn, endereco);
		setSalario(salario);
	}

	public int getSalario() {
		return Salario;
	}

	public void setSalario(int salario) {
		Salario = salario;
	}
	

}
