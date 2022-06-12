import java.util.Scanner;

// Criando Proprias Funçoes 
public class Programa19 {
static String Fruta[];		
static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Informe a Quantidade de de frutas ");
		int Quantidade = Integer.parseInt(input.nextLine());

		Fruta = new String[Quantidade];

		cadastrar_Dados(Quantidade);
		Mostrar_Dados(Quantidade);
		
	input.close();
		}
		
	
	/*
	 Uma Funçao deve ter o seguinte
	 a) Tipo de Retorno
	 b) nome 
	 c) parametros/ argumentos de entrada op 
	 d) Retorno (opicional- depende do tipo de Retorno)
	void = Vazio
	 */
	
	static void cadastrar_Dados(int quantidade ) {
		Fruta= new String[quantidade];
		for (int i = 0; i < quantidade; i++) {

			System.out.println("Informe a " + (i + 1) + " Fruta ");
			Fruta[i] = input.nextLine();}
		
	}
	static void Mostrar_Dados(int quantidade) {
		for (int i = (quantidade -1); i >= 0; i--) {
			System.out.println(Fruta[i]);
			
		}
		
	}
}
