package package15;

import java.util.Scanner;

public class Animais {
	private int raca;
	private String nome_id;
	private int porte;
	private int habitat;
	private String pais_origem;
	Scanner input = new Scanner(System.in);

	public Animais(int raca, int porte, int habitat, String pais_origem, String nome_id) {
		super();
		setRaca(raca);
		setNome_id(nome_id);
		setPorte(porte);
		setHabitat(habitat);
		setPais_origem(pais_origem);
	}

	public int getRaca() {
		return raca;
	}

	@SuppressWarnings("unused")
	public void setRaca(int raca) {
		System.out.println("Escolha uma raça: \n1 para gato \n2 Para Aves \n3 Para Primata ");
		raca = input.nextInt();
		switch (raca) {
		case 1:
			Gato sc;
			break;
		case 2:
			Aves Aves;
			break;
		case 3:
			Primata Primata;
			break;
		default:

			break;
		}
		this.raca = raca;
	}

	public void setPorte(int porte) {
		System.out.println("Escolha um porte: \n1 Para Pequeno: \n2 Para Medio: \n3 Para Grande: ");
		raca = input.nextInt();
		switch (porte) {
		case 1:
			System.out.println("Pequeno");
			break;
		case 2:
			System.out.println("Medio");
			break;
		case 3:
			System.out.println("Grande");
			break;
		default:

			break;

		}
		this.porte = porte;

	}

	public int getHabitat() {
		return habitat;
	}

	public void setHabitat(int habitat) {
		System.out.println("escolha um Tamanho do Habitat: \n1) Para Pequeno \n2)Para Medio \n3) Para Grande ");
		habitat = input.nextInt();
		switch (habitat) {
		case 1:
			System.out.println("Pequeno");

			break;
		case 2:
			System.out.println("Medio");

			break;
		case 3:
			System.out.println("Grande");

			break;

		default:
			break;
		}
		this.habitat = habitat;
	}

	public String getPais_origem() {
		return pais_origem;
	}

	public void setPais_origem(String pais_origem) {
		System.out.println("Escolha um Pais de Origem:");
		pais_origem = input.next();
		this.pais_origem = pais_origem;
	}

	public String getNome_id() {
		return nome_id;
	}

	public void setNome_id(String nome_id) {
		System.out.println("Nome do Animail: ");
		nome_id = input.next();
		this.nome_id = nome_id;
	}

	public int getPorte() {
		return porte;
	}
}
