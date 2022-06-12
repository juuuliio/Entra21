package secao18;
// trabalhando com Strings

/*
 * Strings sao imutaveis, ou seja nao muda
 */
public class Programa41 {

	public static void main(String[] args) {
		String Curso = "Programção Java essencial";
		// Curso = Curso.replace("Java", "Pyton");// altera na String, se encontrar, a
		// primeira pela Segunda
		Curso = Curso.toLowerCase();
		System.out.println(Curso);

		Curso = Curso.toUpperCase();
		System.out.println(Curso);
		// for (int i=0; i< Curso.length();i++) {
		// System.out.print(Curso.charAt(i));
		for (int i = (Curso.length()-1); i >= 0; i--) {
			System.out.print(Curso.charAt(i));

		}

	}

}
