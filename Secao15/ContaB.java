package Secao15;

public class ContaB {
	private String Cliente;
	private int numero;
	
	public static int contador = 1;

	public ContaB(String cliente) {
		super();
		Cliente = cliente;
		this.numero = contador;
		ContaB.contador = ContaB.contador +1;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public static int proxima_conta() {
		return ContaB.contador;
		
	}
}
