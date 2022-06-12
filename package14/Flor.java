package package14;

public class Flor {
	private String Cliente;
	private String nome_Flor;
	private double preco;

	public Flor(String cliente, String nome_Flor, double preco) {
		setCliente(cliente);
		setNome_Flor(nome_Flor);
		setPreco(preco);
		
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public String getNome_Flor() {
		return nome_Flor;
	}

	public void setNome_Flor(String nome_Flor) {
		this.nome_Flor = nome_Flor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
