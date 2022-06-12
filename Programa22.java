//objetos
/*
 * objetos sao produtos/ instacias da Classe
 */
public class Programa22 {

	public static void main(String[] args) {
		int numero =4;
		
		// declaração de um objeto 
		Produto p0;
		// declaração e instaciação do objeto
		//p1 -> instacia do objeto/ objeto
		Produto p1= new Produto();//construtor
		p1.nome= "Notbook";
		p1.preco = 2.367f;
		p1.Desconto= 15.0f;
		
		
		System.out.println("============Produto==================");
		System.out.println(p1.nome);
		System.out.println("R$" +p1.preco);
		System.out.println(p1.Desconto+"%");
		
		p0=new Produto();//construtor
		p0.nome= "Caneta BIC";
		p0.preco=2.45f;
		p0.Desconto= 5f;
		
		System.out.println(p0.nome);
		System.out.println("R$" +p0.preco);
		System.out.println(p0.Desconto+"%");
		
		Pessoa pessoa1 = new Pessoa();//construtor
		pessoa1.nome="Julio Cesar";
		pessoa1.email= "julio_adoa@hotmail.com";
		pessoa1.ano_nacimento= 1995;
		System.out.println("============Pessoa==================");
		System.out.println("Nome "+pessoa1.nome);
		System.out.println("email "+pessoa1.email);
		System.out.println("Data de Nacimento"+pessoa1.ano_nacimento);
		
		
		
	}

}
