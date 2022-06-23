import java.time.LocalDate;

public class pessoa {
	String nome;
	String cpf;
	LocalDate dn;
	String endereco;
	public pessoa(String nome, String cpf, LocalDate dn, String endereco) {
		super();
		setNome(nome);
		setCpf(cpf);
		setDn(dn);
		setEndereco(endereco);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDn() {
		return dn;
	}
	public void setDn(LocalDate dn) {
		this.dn = dn;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
