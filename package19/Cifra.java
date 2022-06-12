package package19;

public class Cifra {
	public static String Codifica(String a, int teste) {
		int i,n=a.length();
		String texto="";
		for(i=0;i<n; i++) {
			texto = texto+(char)(a.charAt(i)+teste);
		}
		return(texto);
	}public static String Descodifica(String a, int teste) {
		int i,n=a.length();
		String texto="";
		for(i=0;i<n; i++) {
			texto = texto+(char)(a.charAt(i)-teste);
		}
		return(texto);
		
	}
}
