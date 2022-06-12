package secao13;
// templete method
/*
 * final é um madificador de acesso que faz com que o elemento que 
 * esteja utlizando, nao possa ser extends/ reescrito
 */
public abstract class Treinamento {
	// templete method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	public abstract void preparoFisico();
	public abstract void jogoTreino();
	public final void treinoTatico() {
		System.out.println("TreinoTatico");
	}
}
