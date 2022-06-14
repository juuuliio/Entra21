package Data;

import java.time.LocalDate;

public class teste4 {
	String nome;
	LocalDate dn;
	public teste4(String nome, LocalDate dn) {
		setNome(nome);
		setDn(dn);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDn() {
		return dn;
	}
	public void setDn(LocalDate dn) {
		this.dn = dn;
	}

}
