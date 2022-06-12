package secao16;

// tratando exceçoes com try/catch
/*
 * utlizamos para tentar realizar algo ,geramnente realizar aquilo que 
 * pode acarretar um probluma
 * 
 * utlizamos o catch para capturar o erro e com isso oferecer ao usuario do sistema 
 * uma mensagem adequada sem que o sistema quebre
 */
public class Programa36 {

	public static void main(String[] args) {
		int numero[] = new int[5];

		for (int i = 0; i < numero.length; i++) {
			numero[i] = (i + 3) * 2;
			// System.out.println(numero[i]);
		}
		for (int i = 0; i <= numero.length; i++) {
			try {// tente fazer
				System.out.println(numero[i]);
			} catch (Exception e) {
				System.err.println("Voçe esta tentando acessar uma posição invalida");
			}finally {
				System.out.println("continue o PROCESSO...");
			}
		}
	}

}
