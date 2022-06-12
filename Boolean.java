
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
			System.out.println("é Vedadeiro");
		}else {
			System.out.println("É Falso");
		}if (1==1) {
			System.out.println("1==1 é Verdadeiro");
		}else {
			System.out.println("... é Falso");
		}if (ativo) {
			System.out.println("Pode acessar o sistema ");
		}else {
			System.out.println("Acesso NEGADO!!!!");
		}
	}

}
/*
if (Realiza uma Verificação se é true ou False)
*/