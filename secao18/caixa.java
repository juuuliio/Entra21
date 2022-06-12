package secao18;
// caixa de Object generico	
public class caixa {
	private Object[] Object;
	private int posicaoLivre;

	public caixa() {
		Object = new Object[100];
		posicaoLivre = 0;
	}

	public void adicionar(Object nova) {
		this.Object[this.posicaoLivre] = nova;
		this.posicaoLivre++;
	}

	public Object pegar(int posicao) {
		return this.Object[posicao];
	}

}
