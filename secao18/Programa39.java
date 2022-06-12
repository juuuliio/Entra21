package secao18;

import package11.Cliente;
import package11.Conta;

// object : a mae de todas as classes
/*
 * a classe object faz parte do pacote java.lang
 */
public class Programa39 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Cliente Cl1 = new Cliente ("Julio Cesar", "Rua Anitapolis");
		Cliente Cl2 =new Cliente ("Helena Talyta", "Rua Anitapolis");
		Conta c1 = new Conta (10, 200, 300, Cl1);
		Conta c2 = new Conta (11, 200, 300,Cl2);
		
		caixa prateleira = new caixa();
		
		System.out.println(c1);// por padrao a instasia imprime com toString
		System.out.println(c2);
		if (c1.equals (Cl1)) {
			System.out.println("Sao a mesma Conta");
		}else {
			System.out.println("Sao Contas Diferentes");
		}
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//Conta conta =prateleira.pegar(0);
		System.out.println(((Conta) prateleira.pegar(0)).getSaldo());//Cast
		prateleira.adicionar(Cl1);
		System.out.println(((Cliente) prateleira.pegar(2)).getNome());// Cast
		
		if((Object) Cl1 instanceof Conta) {
			System.out.println("O object é um tipo Conta");
		}else {
			System.out.println("O Object nao é de um tipo de Conta");
		}
		
	}

}
