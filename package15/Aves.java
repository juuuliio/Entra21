package package15;

public class Aves extends Animais {
	private String Tipos_pena;
	private String Alimentacao;

	public Aves(int raca, String nome_id, int porte, int habitat, String pais_origem, String aliemtacao, String Tipos_pena) {
		super(raca, porte, habitat, pais_origem, nome_id);
		setAlimentacao(Alimentacao);
		setTipos_pena(Tipos_pena);
	}

	public String getTipos_pena() {
		return Tipos_pena;
	}

	public void setTipos_pena(String tipos_pena) {
		Tipos_pena = tipos_pena;
	}

	public String getAlimentacao() {
		return Alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		Alimentacao = alimentacao;
	}
}
