import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
	Scanner input = new Scanner(System.in);
	public static final String LocalDate = null;
	static String nome;
	static String Placa;
	LocalDate Data_aquisicão;
	int Manutencao;
	static ArrayList<Veiculo> lista = new ArrayList<Veiculo>();

	public Veiculo(String nome, String placa, LocalDate data_aquisicão, int manutencao) {
		setNome(nome);
		setPlaca(placa);
		setData_aquisicão(data_aquisicão);
		setManutencao(manutencao, manutencao);
		this.lista.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("Informe o modelo do Caminhao:");
		nome = input.next();
		this.nome = nome;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		System.out.println("Informe a Placa");
		placa =input.next();
		Placa = placa;
	}

	public LocalDate getData_aquisicão() {
		return Data_aquisicão;
	}

	public void setData_aquisicão(LocalDate data_aquisicão) {
		System.out.println("informe a Data de Data aquisicão: ");
		data_aquisicão = java.time.LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
		Data_aquisicão = data_aquisicão;
	}

	public int isManutencao(int manutencao) {
		
		return 0;
	}

	public void setManutencao(int dias, int valor) {
		int dias1 = 0, valo1 = 0;
		System.out.println("Informe se o Veiculo tem Manutencao: \n1 para Sim \n2 para NAO: ");
		int op = input.nextInt();
		switch (op) {
		case 1:
			System.out.println("Informe Quantos Itens: ");
			int a = input.nextInt();
			for (int i = 0; i < a; i++) {
				System.out.println("Informe a peça:");
				String peça = input.next();
				System.out.println("Informe o valor: ");
				int valor1 = input.nextInt();
				System.out.println("Informe os dias parado: ");
				dias1 = input.nextInt();
				
				 
				if (dias1 <= 20) {
					System.out.println("Indice de Sucatiameto = 0");
				} else if (dias1 > 21 && dias1 <= 50) {
					System.out.println("Indice de Sucatiameto = 0,5");
				}else if(dias1 >51 && dias1 <=80) {
					System.out.println("Indice de Sucatiameto = 1");
				}else if (dias1 >81 && dias1 <=120) {
					System.out.println("Indice de Sucatiameto = 1,5");
				}else if (dias1 >120){
				System.out.println("Indice de Sucatiameto =2,0");	
				}
			}
		case 2:
			System.out.println("Nao a Indice de Sucatiameto\n");
			break;
		}
		//int manutencao = 0;
		Manutencao = dias1;
	}

	public static ArrayList<Veiculo> getLista() {
		return lista;
	}

	public static void setLista(ArrayList<Veiculo> i) {
		Veiculo.lista = i;
	}


	}


