package secao14;
/*
 * uma interface pode conter 
 * cosntates;
 * Metodos abstract;
 * 
 * interface para servir contrador de IEletronico
 * todo podo produto que implimentar esta interface obrogatoriamento
 * deverao implemntar os Metodos abstract
 *
 */
public interface IEletronico {
	
	public String MARCA	 = "julio";// constante
	public void ligar();// Metodos abstract
	public void desligar();// Metodos abstract
	
}
