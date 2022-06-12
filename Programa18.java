//Matrizes Parte 2
public class Programa18 {

	public static void main(String[] args) {
		int numero[][] = new int[3][3];
		numero[0][0] = 1;
		numero[0][1] = 5;
		numero[0][2] = 21;
		numero[1][0] = 7;
		numero[1][1] = 18;
		numero[1][2] = 9;
		numero[2][0] = 11;
		numero[2][1] = 13;
		numero[2][2] = 15;

		// System.out.println(numero[1][2]);
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero[i].length; j++) {
				numero[i][j] = i + j * 2;

			}
		}
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero[i].length; j++) {
				System.out.println("numero[" + i + "][" + j + "]= " + numero[i][j]);

			}

		}
	}
}