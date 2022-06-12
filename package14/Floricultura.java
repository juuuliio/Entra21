package package14;

public class Floricultura {
	public static void main(String[] args) {
		
		Flor Flor1 = new Flor(null, null, 0);
		Flor Flor2 = new Flor(null, null, 0);
		Flor Flor3 = new Flor(null, null, 0);
		Flor Flor4 = new Flor(null, null, 0);
		Flor Flor5 = new Flor(null, null, 0);
		
		Flor1.setNome_Flor( "Flor1");
		Flor1.setPreco (10);
		Flor2.setNome_Flor("Flor2");
		Flor2.setPreco(20);
		Flor3.setNome_Flor("Flor3");
		Flor3.setPreco (30);
		Flor4.setNome_Flor("Flor4");
		Flor4.setPreco (40);
		Flor5.setNome_Flor("Flor5");
		Flor5.setPreco (50);
		Flor[] flor = new Flor[5];
		flor[0] = Flor1;
		flor[1] = Flor2;
		flor[2] = Flor3;
		flor[3] = Flor4;
		flor[4] = Flor5;
		for (int i = 0; i < flor.length; i++) {
			System.out.println(flor[i].getNome_Flor() + " " + flor[i].getPreco());
			System.out.println("");
		}
	}
}
