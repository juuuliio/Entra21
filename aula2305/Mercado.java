package aula2305;

public class Mercado {
	public static void main(String[] args) {

		MetodoM Joinville = new MetodoM();
		Joinville.maca = 10;
		Joinville.preco = 2.99;
		Joinville.quantidade = 19874;
		Joinville.laranja = 15;
		Joinville.preco1 = 2.99;
		Joinville.quantidade1 = 1480;
		MetodoM Blumenau = new MetodoM();
		Blumenau.maca = 10;
		Blumenau.preco = 2.99;
		Blumenau.quantidade = 5388;
		Blumenau.laranja = 15;
		Blumenau.preco1 = 2.99;
		Blumenau.quantidade1 = 2588;
		MetodoM Gaspar = new MetodoM();
		Gaspar.laranja = 10;
		Gaspar.preco1 = 2.99;
		Gaspar.quantidade1 = 125;
		Gaspar.maca = 10;
		Gaspar.preco = 2.99;
		Gaspar.quantidade = 585;
		// b) Quem teve o maior lucro vendendo laranjas?
		double MediaMecL = (Joinville.quantidade1 * Joinville.preco1);
		double MediaMecL2 = (Gaspar.quantidade1 * Gaspar.preco1);
		double MediaMecL3 = (Blumenau.quantidade1 * Blumenau.preco1);
		System.out.println(MediaMecL);
		System.out.println(MediaMecL2);
		System.out.println(MediaMecL3);

		if (MediaMecL > MediaMecL2 && MediaMecL > MediaMecL3) {
			System.out.println("Joinville tem maior Lucro vendendo laranja");
		} else if (MediaMecL2 > MediaMecL3 && MediaMecL2 > MediaMecL3) {
			System.out.println("Gaspar tem o maior lubro vendendo laranja");
		} else if (MediaMecL3 > MediaMecL && MediaMecL3 > MediaMecL2) {
			System.out.println("Blumenau tem o maior lucro vendendo laranja");
		}

		// a) Quem teve o maior lucro vendendo ma��s?
		double MediaMecM = (Joinville.quantidade * Joinville.preco);
		double MediaMecM2 = (Gaspar.quantidade * Gaspar.preco);
		double MediaMecM3 = (Blumenau.quantidade * Blumenau.preco);

		if (MediaMecM > MediaMecM2 && MediaMecL > MediaMecM2) {
			System.out.println("Joinville tem maior Lucro Vendendo Ma��s " + MediaMecM);
		} else if (MediaMecM2 > MediaMecM && MediaMecM2 > MediaMecM3) {
			System.out.println("Gaspar tem o  maior lucro Vendendo Ma��s" + MediaMecM2);

		} else if (MediaMecM3 > MediaMecM && MediaMecM3 > MediaMecM2) {
			System.out.println("Blumenau Tem o maior Lucro Vendendo ma��s" + MediaMecM3);
		}
		// c) Qual das lojas teve o maior lucro nesse ano espec�fico?
		double Lucro = (Joinville.quantidade + Joinville.quantidade1 * Joinville.preco1);
		double Lucro2 = (Gaspar.quantidade + Gaspar.quantidade1 * Gaspar.preco1);
		double Lucro3 = (Blumenau.quantidade + Blumenau.quantidade1 * Blumenau.preco1);

		if (Lucro > Lucro2 && Lucro > Lucro3) {
			System.out.println("O Maior  lucro � Joinville De Vendas $" + Lucro);

		} else if (Lucro2 > Lucro && Lucro2 > Lucro3) {
			System.out.println("O Maior  lucro � Gaspar De Vendas $" + Lucro2);
		} else if (Lucro3 > Lucro && Lucro3 > Lucro2) {
			System.out.println("O Maior  lucro � Blumenau De Vendas $" + Lucro3);
		}

		// d) Qual das lojas teve o menor lucro?
		if (Lucro < Lucro2 && Lucro < Lucro3) {
			System.out.println("Menor Lucro � Joinville " + Lucro);
		} else if (Lucro2 < Lucro && Lucro2 < Lucro3) {
			System.out.println("O menor Lucro � Gaspar " + Lucro2);
		} else if (Lucro3 < Lucro && Lucro3 < Lucro2) {
			System.out.println("O menor lucro � Blumenau " + Lucro3);
		}
		// e) Qual das lojas ficou no "meio" em termos de lucro?

		if (Lucro > Lucro2 && Lucro < Lucro3) {
			System.out.println("O Lucro do meio � Joinville " + Lucro);
		} else if (Lucro2 > Lucro && Lucro2 < Lucro3) {
			System.out.println("O Lucro do meio � Gaspar " + Lucro2);

		} else if (Lucro3 > Lucro && Lucro3 < Lucro2) {
			System.out.println("O  Lucro do meio � Blumenau" + Lucro3);
		}
		// f) Juntando as 3 lojas, a franquia teve um lucro maior vendendo ma��s ou
		// laranjas?
		if (Lucro > Lucro2 && Lucro > Lucro3) {
			System.out.println(" franquia teve um lucro maior vendendo ma��s ou laranjas � Joinville " + Lucro);

		} else if (Lucro2 > Lucro && Lucro2 > Lucro3) {
			System.out.println(" franquia teve um lucro maior vendendo ma��s ou laranjas � Gaspar " + Lucro2);
		} else if (Lucro3 > Lucro && Lucro3 > Lucro2) {
			System.out.println(" franquia teve um lucro maior vendendo ma��s ou laranjas � Blumenau  com " + Lucro3);
		}
	}
}
