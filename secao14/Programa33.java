package secao14;
// interface - que é qunando utilizar	
/*
 * interface sao conhecidas como "contratos"
 * 
 * uma impresa criou um contrato "com regraS" para definir 
 * uma criação de um produto ou service 
 * quem implementar esse contrato é obrogado a seguir as regra
 * 
 *  o Joao, decidiu implementar uma produto ou serviço baseado nesse contratos
 *  A maria tambem decidiu Implementar um produto/serviço
 *  
 *  contrato para confecção para um bolo 
 *  - o bolo presisa ser de chocolate
 *  - o bolo deve ter cobertura
 *  - o bolo deve ser recheado
 */
public class Programa33 {
 
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Ventilador vent = new Ventilador ();
		System.out.println("A marca é " + vent.MARCA);
		vent.desligar(); // nao deve Implementar
		vent.ligar(); 
		vent.desligar();
	}

}
