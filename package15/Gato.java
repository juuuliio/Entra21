package package15;

public class Gato extends Animais {
	private int pelagem;
	private int mancha;

	public Gato(int raca,String nome_id, int porte, int habitat, String pais_origem, int pelagem, int mancha) {
		super(raca,  porte, habitat, pais_origem, nome_id);
		setPelagem(pelagem);
		setMancha(mancha);
	}

	public int getPelagem() {
		return pelagem;
	}

	public void setPelagem(int pelagem) {
		this.pelagem = pelagem;
		switch (pelagem) {
		case 1:
			System.out.println("preto");
			break;
		case 2:
			System.out.println("Pardo");
		default:
			break;
		}

	}

	public int getMancha() {
		return mancha;
	}

	public void setMancha(int mancha) {
		this.mancha = mancha;
		switch (mancha) {
		case 1:
			System.out.println("Pintado");

			break;
		case 2:
			System.out.println("Listrado");
		case 3:
			System.out.println("Ausente de mancha");
		default:
			break;
		}
	}

}
