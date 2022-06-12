package aula2305;

public class Aeronave {

	public static void main(String[] args) {
		Aeronave2 B737_700 = new Aeronave2();
		B737_700.Passageiros = 149;
		B737_700.Velocidade_maxima = 876;
		B737_700.capacidadeDeCombustível = 26.022;
		B737_700.QCM = 221.35;

		Aeronave2 B737_MAX = new Aeronave2();
		B737_MAX.Passageiros = 349;
		B737_MAX.Velocidade_maxima = 836;
		B737_MAX.capacidadeDeCombustível = 25.816;
		B737_MAX.QCM = 232.414;

		Aeronave2 B737_800 = new Aeronave2();
		B737_800.Passageiros = 189;
		B737_800.Velocidade_maxima = 946;
		B737_800.capacidadeDeCombustível = 26.022;
		B737_800.QCM = 221.35;

		Aeronave2 B747_8 = new Aeronave2();
		B747_8.capacidadeDeCombustível = 238.610;
		B747_8.Passageiros = 410;
		B747_8.Velocidade_maxima = 988;
		B747_8.QCM = 395.6;

		// b) Qual aeronave leva o maior número de passageiros?

		if (B747_8.Passageiros > B737_700.Passageiros && B747_8.Passageiros > B737_MAX.Passageiros
				&& B747_8.Passageiros > B737_800.Passageiros) {
			System.out.println("B747_8 Tem maior Capacidade De Passageiros " + B747_8.Passageiros);
		} else if (B737_800.Passageiros > B747_8.Passageiros && B737_800.Passageiros > B737_MAX.Passageiros
				&& B737_800.Passageiros > B737_700.Passageiros) {
			System.out.println("B737_800 Tem maior Capacidade De Passageiros " + B737_800.Passageiros);
		} else if (B737_MAX.Passageiros > B747_8.Passageiros && B737_MAX.Passageiros > B737_800.Passageiros
				&& B737_MAX.Passageiros > B737_700.Passageiros) {
			System.out.println("B737_MAX Tem maior Capacidade De Passageiros " + B737_MAX.Passageiros);
		} else if (B737_700.Passageiros > B737_800.Passageiros && B737_700.Passageiros > B737_MAX.Passageiros
				&& B737_700.Passageiros > B747_8.Passageiros) {
			System.out.println("B737_700 Tem maior Capacidade De Passageiros " + B737_700.Passageiros);
		}
		double Aero1 = ((B737_700.QCM * B737_700.Velocidade_maxima) / B737_700.capacidadeDeCombustível);
		// System.out.println(Aero1);
		double Aero2 = ((B737_800.QCM * B737_800.Velocidade_maxima) / B737_800.capacidadeDeCombustível);
		// System.out.println(Aero2);
		double Aero3 = ((B737_MAX.QCM * B737_MAX.Velocidade_maxima) / B737_MAX.capacidadeDeCombustível);
		// System.out.println(Aero3);
		double Aero4 = ((B747_8.QCM * B747_8.Velocidade_maxima) / B737_MAX.capacidadeDeCombustível);
		// System.out.println(Aero4);
		// c) Considerando que os aviões estão em velocidade máxima, quem vai mais
		// longe?
		if (Aero1 > Aero2 && Aero1 > Aero3 && Aero1 > Aero4) {
			System.out.println("Distacia Maxima " + Aero1 + " km ");
		} else if (Aero2 > Aero1 && Aero2 > Aero3 && Aero2 > Aero4) {
			System.out.println("Distacia Maxima " + Aero2 + " Km");
		} else if (Aero3 > Aero1 && Aero3 > Aero2 && Aero3 > Aero4) {
			System.out.println("Distancia Maxima " + Aero3 + " Km");
		} else if (Aero4 > Aero1 && Aero4 > Aero2 && Aero4 > Aero3) {
			System.out.println("Distancia Maxima " + Aero4 + " Km");
		}
		
	}

}
