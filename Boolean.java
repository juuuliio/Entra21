
public class Boolean {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// boolean Primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		// boolean nao primitivos
		boolean V = true;
		boolean F = false;

		boolean ativo = true;
				
		System.out.println("VERDADEIRO"+ verdadeiro);
		System.out.println("Falso " + falso);
		System.out.println("v" + V);
		System.out.println("F"+ F);
		
		if(verdadeiro) {
			System.out.println("� Vedadeiro");
		}else {
			System.out.println("� Falso");
		}if (1==1) {
			System.out.println("1==1 � Verdadeiro");
		}else {
			System.out.println("... � Falso");
		}if (ativo) {
			System.out.println("Pode acessar o sistema ");
		}else {
			System.out.println("Acesso NEGADO!!!!");
		}
	}

}
/*
if (Realiza uma Verifica��o se � true ou False)
*/