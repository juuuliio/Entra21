// Classe
/*
 *
 * o nome das classe iniciam em letra maiuscila 
 * o nome deve conter asentuação, caracteres, e espaço
 * nas classes Java, nao possui a implemtação do main
 * toda classe Javaa possui a seguinte forma:
 * public class NomeDaClasse{
 * O nome da Classe do Java Ser ser o mesmo
 *  tudo que estiver dentro das {} faz parte da Classe
 *  
 *  * atributos
 *  sao caracterisca de classe/molde/modelo de Dados
 *  podmeos entender atributos como variaveis da classes
 *  uma outra forma de nomenclatura sao estados.
 *  os atributos so nomeado em letra minuscula sem espaço
 *  caracteres especias sem acentuação 
 *  
 *  // Metodos
 *  podemos entender os metodos como a ação qie é reaçizados por um objetos  pela  Classe
 *  podemos entender tambem que os metodos sao comportamento dos objetos da classe
 *  
 *  mesmo requisitos para funçoes 
 *  	 Uma Funçao deve ter o seguinte
	 a) Tipo de Retorno
	 b) nome 
	 c) parametros/ argumentos de entrada op 
	 d) Retorno (opicional- depende do tipo de Retorno)
	void = Vazio
 */
public class Produto {
	String nome;
	float preco;
	float Desconto;
	//metodo para aumetar o preço do projeto em 10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
	
}
