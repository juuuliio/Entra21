package package13;

public class Pizza {
private double tamnho;
private double preco;
private String sabor;

public Pizza(double tamnho, double preco, String sabor) {
	
	setPreco(preco);
	setSabor(sabor);
	setTamnho(tamnho);
}

public double getTamnho() {
	return tamnho;
}

public void setTamnho(double tamnho) {
	this.tamnho = tamnho;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public String getSabor() {
	return sabor;
}

public void setSabor(String sabor) {
	this.sabor = sabor;
}

}
