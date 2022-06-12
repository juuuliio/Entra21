package package17;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dados {
	LocalDate data_nacsDate;
	String Nome;
	String sexo;
	static ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

	

	public Dados(LocalDate of, String nome, String sexo) {
		setData_nacsDate(data_nacsDate);
		setNome(nome);
		setSexo(sexo);
	}

	public LocalDate getData_nacsDate() {
		return data_nacsDate;
	}

	public void setData_nacsDate(LocalDate data_nacsDate) {
		this.data_nacsDate = data_nacsDate;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static ArrayList<Pessoa> getLista() {
		return lista;
	}

	public static void setLista(ArrayList<Pessoa> lista) {
		Dados.lista = lista;
	}

}
