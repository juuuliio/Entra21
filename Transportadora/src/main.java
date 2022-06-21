import java.time.LocalDate;
import java.util.Scanner;

public class main {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		int valor = 0, dias = 0;
		Scanner input = new Scanner(System.in);
		Veiculo v1 = new Veiculo(null, null, null, 0);
		Veiculo v2 = new Veiculo(null, null, null, 0);
		
		
				
			System.out.println(v1.isManutencao(dias) + v1.isManutencao(valor));
			
			
	}

}
