import java.time.LocalDate;

public class vendedor extends pessoa{
	String id;

	public vendedor(String nome, String cpf, LocalDate dn, String endereco, String id) {
		super(nome, cpf, dn, endereco);
		setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
