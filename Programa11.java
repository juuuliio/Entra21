// Tipos de Dados
// Numericos (Inteiro e reais )
public class Programa11 {

	public static void main(String[] args) {

		// por padrao os numeros reais em Java sao Considerados double
		
		float preco = 23.4f;// 23,40
		double preco2 = 23.4;// 23,433385
		
		// tipos nao primitivos; primitivos
		float preco3 = 44.5f;
		double preco4 = 44.5;

		System.out.println("float -> preco1 =  " + preco);
		System.out.println("double ->preco2 = " + preco2);
		System.out.println("float ->preco3 =  " + preco3);
		System.out.println("double-> preco4 = " + preco4);
		
		System.out.println("Float/Float " + Float.SIZE + " bits");
		System.out.println("Double/Double " + Double.SIZE + " bits");
		

		System.out.println("Valor minimo Double/Double " + Double.MIN_VALUE);
		System.out.println("Valor MAximo Double/Double " + Double.MAX_VALUE);

		System.out.println("Valor minimo Float/Float " + Float.MIN_VALUE);
		System.out.println("Valor MAximo Float/Float " + Float.MAX_VALUE);

		
	}
	}

