package secao14;
// interface - que � qunando utilizar	
/*
 * interface sao conhecidas como "contratos"
 * 
 * uma impresa criou um contrato "com regraS" para definir 
 * uma cria��o de um produto ou service 
 * quem implementar esse contrato � obrogado a seguir as regra
 * 
 *  o Joao, decidiu implementar uma produto ou servi�o baseado nesse contratos
 *  A maria tambem decidiu Implementar um produto/servi�o
 *  
 *  contrato para confec��o para um bolo 
 *  - o bolo presisa ser de chocolate
 *  - o bolo deve ter cobertura
 *  - o bolo deve ser recheado
 */
public class Programa33 {
 
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Ventilador vent = new Ventilador ();
		System.out.println("A marca � " + vent.MARCA);
		vent.desligar(); // nao deve Implementar
		vent.ligar(); 
		vent.desligar();
	}

}
