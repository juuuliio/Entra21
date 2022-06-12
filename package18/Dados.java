package package18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Dados {
	String nome;
	LocalDate dn;

	static ArrayList<Dados> Progama12 = new ArrayList<Dados>();

	public Dados(String nome, LocalDate dn) {
		super();
		setNome(nome);
		setDn(dn);
		Progama12.add(this);
	}

	public static ArrayList<Dados> getProgama12() {
		return Progama12;
	}

	public static void setProgama12(ArrayList<Dados> progama12) {
		Progama12 = progama12;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDn() {
		
		return dn;
	}

	public void setDn(LocalDate dn) {
		
		this.dn = dn;
	}

	public char[] compareTo(Dados antonio) {
		
		return null;
	}

	

	}
	


