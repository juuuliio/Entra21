package marcel;

public  class Mat {
int x;

public Mat(int x) {
	setX(x);
}

public int getX() {

	return x;
}

public static void setX(int x) {
	if (x <=0) {
		throw new Error ("Numero Invalido");
	}
	
}
}
