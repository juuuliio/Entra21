package package11;
/*protected (Protegido)	
 * 
 * ele é o modificador de acessso default (padrao)  
 * 
 *O modificador de acessso protected faz com que o elmento 
 *seja visivel somente do mesmo pacate onde o elmento foi declarado
 */
public class Cliente  {
	private String nome;
	private String endereco;

	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;

		
	}
	void dizer_oi() {
		System.out.println(this.nome + "Esta Dizendo OI");
	}public String getNome() {
		return this.nome;
		
	}public String getEndereco() {
		return this.endereco;
	}

}
