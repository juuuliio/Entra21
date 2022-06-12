package package20;

import java.time.LocalDate;

public class Pessoa extends Funcionario  {

	Endereco endereco;
	String Nome;
	LocalDate dataIngressoDate;
	LocalDate Dn;

	public Pessoa(double cargaHoraria, double salario, Endereco endereco, String nome, LocalDate dataIngressoDate,
			LocalDate dn) {
		super(cargaHoraria, salario);
		this.endereco = endereco;
		Nome = nome;
		this.dataIngressoDate = dataIngressoDate;
		Dn = dn;
	}

}
