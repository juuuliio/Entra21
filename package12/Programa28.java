package package12;

// Herança
public class Programa28 {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa("Julio", "04/06/1995", "Julio_adao@hotmail.com");
		//System.out.println(p1);
		//System.out.println("\n");
		//System.out.println(p1.getNome());
		//System.out.println(p1.getAno_Nasc());
		
		Aluno a1 = new Aluno("Helena Talyta", "30/05/1995", "01", "Helenatpaz@hotmail.com");
		System.out.println(a1);
		System.out.println("\n");
		//System.out.println(a1.getNome());
		
		Professor P1 = new Professor("Antonio","132", "12/05/1964", "A.adao@bol.com.br");
		System.out.println(P1);
		System.out.println("\n");
		//System.out.println(P1.getNome());
		//System.out.println(a1.toString());
	}

}
