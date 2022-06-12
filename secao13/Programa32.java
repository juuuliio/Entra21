package secao13;
// templete method

/*
 * o padrao templete method define o esqueleto de um algoritomo de um method,
 * tranferindo alguns de sues passos para as subclasses.O templete method permite 
 * que as subclasses redefinam certos passos de um algoritomo se alterar a estrutura 
 * do ppropio algoritomo.
 * 
 * Algoritomos sao "receitas " passo a passo para resolver algum problema.
 * 
 * receber numero 
 * retornar numero * numero
 * 
 *  method_ pricipal(){
 *  passo1();
 *  passo2();
 *  Passo3();
 *  }
 */
public class Programa32 {

	public static void main(String[] args) {
		TreinamentoDoInicioDaTemporada tit = new TreinamentoDoInicioDaTemporada();
		tit.treinoDiario();

		TreinamentoDoFinalDaTemporada2 tft = new TreinamentoDoFinalDaTemporada2();
		tft.treinoDiario();
	}

}
