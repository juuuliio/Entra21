import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int valor1 = 0, dias1 = 0;
		Scanner input = new Scanner(System.in);
		Veiculo v1 = new Veiculo(null, null, null, 0);
		Veiculo v2 = new Veiculo(null, null, null, 0);

		System.out.println(v1.Manutencao);
		System.out.println(v2.Manutencao+" " + v2.nome);
		input.close();
	}

}
