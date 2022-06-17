package estação;

public class Classes {
static String Verao;
static String Inverno;
static String Outono;
static String Primavera;
public Classes(String verao, String inverno, String outono, String primavera) {
	super();
	setVerao(verao);
	setInverno(inverno);
	setOutono(outono);
	setPrimavera(primavera);
}
public static String getVerão() {
	System.out.println("Esta Quente");
	return Verao;
}
public static void setVerao(String verao) {
	System.out.println("Esta Quente");
	Verao = verao;
}
public static String getInverno() {
	return Inverno;
}
public void setInverno(String inverno) {
	System.out.println("Esta Frio");
	Inverno = inverno;
}
public static String getOutono() {
	return Outono;
}
public static  void setOutono(String outono) {
	System.out.println("A temperatura esta boa");
	Outono = outono;
}
public static String getPrimavera() {
	return Primavera;
}
public static void setPrimavera(String primavera) {
	System.out.println("Cuidado com alergia");
	Primavera = primavera;
}
}
