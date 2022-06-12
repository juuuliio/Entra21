// Tipos de Dados
// Numericos (Inteiro e reais )
public class Programa10 {
	public static void main(String[] args) {
		// Tipos Primário
		long num0 = 99;// inteiro longo
		int num1 = 4;// inteiro 999999999999
		short num2 = 4; // inteiro (Curto/menor/baixo)9999
		byte num3 = 4;
		char num8 = 127;
		// Tipos nao Primarios
		Integer num4 = 98;
		long num7 = 99;
		short num5 = 7;
		byte num6 = 4;
		char num9 = 142;

		System.out.println("Char ->num8" + num8);
		System.out.println("long -> num0 =" + num0);
		System.out.println("Int ->num1 " + num1);
		System.out.println("shor ->num2 " + num2);
		System.out.println("long -> num" + num7);
		System.out.println("integer ->num3 " + num3);
		System.out.println("Short -> num4 " + num4);
		System.out.println("Char -> num9 " + num9);

		System.out.println("long/long" + Long.SIZE + " bits");
		System.out.println("int/integer" + Integer.SIZE + " bits");
		System.out.println("int/integer" + Short.SIZE + " bits");
		System.out.println("int/integer" + Byte.SIZE + " bits");
		System.out.println("Char/Character" + Character.SIZE + " bits");

		System.out.println("Valor minimo Long/Long" + Long.MIN_VALUE);
		System.out.println("Valor MAximo Long/Long" + Long.MAX_VALUE);

		System.out.println("Valor minimo int/integer" + Integer.MIN_VALUE);
		System.out.println("Valor MAximo int/integer" + Integer.MAX_VALUE);

		System.out.println("Valor minimo Short/Short" + Short.MIN_VALUE);
		System.out.println("Valor MAximo Short/Short" + Short.MAX_VALUE);

		System.out.println("Valor minimo Byte/Byte" + Byte.MIN_VALUE);
		System.out.println("Valor MAximo Byte/Byte" + Byte.MAX_VALUE);

		System.out.println("Valor minimo Char/Character" + Character.MIN_VALUE);
		System.out.println("Valor MAximo Char/Character" + Character.MAX_VALUE);
	}

}
