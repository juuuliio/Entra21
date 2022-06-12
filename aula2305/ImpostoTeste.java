package aula2305;

public class ImpostoTeste {

	public static void main(String[] args) {
		ClienteTeste Cliente1 = new ClienteTeste(1000.0, "0000000", "Julio ", "SC", 1000.0);
		ClienteTeste Cliente2 = new ClienteTeste(9000.0, "0000000", "Cesar", "SC", 9000.0);
		ClienteTeste Cliente3 = new ClienteTeste(25000.0, "0000000", "Sandro ", "SC", 25000.0);
		ClienteTeste Cliente4 = new ClienteTeste(38000.0, "0000000", "Diego", "SC", 38000.0);
		if (Cliente1.Renda <= 4000) {
			System.out.println("Se Deu Bem");
		} else if (Cliente1.Renda >= 4001 && Cliente1.Renda <= 9000) {
			Cliente1.Salario = Cliente1.Renda * 5.8;
			System.out.println(Cliente1.Salario);
		} else if (Cliente1.Renda >= 9001 && Cliente1.Renda <= 25000) {
			Cliente1.Salario = Cliente1.Renda * 15;
			System.out.println("Seu Imposto " + Cliente1.Salario);
		}else if (Cliente1.Renda >= 25001 && Cliente1.Renda <=35000) {
			Cliente1.Salario = Cliente1.Renda *27.5;
			System.out.println("Seu Imposto " + Cliente1.Salario);
		}else if (Cliente1.Renda >=35001 ) {
			Cliente1.Salario = Cliente1.Renda *30;
			System.out.println("Seu Imposto " + Cliente1.Salario);
		}

		if (Cliente2.Renda <= 4000) {
			System.out.println("Se Deu Bem");
		} else if (Cliente2.Renda >= 4001 && Cliente2.Renda <= 9000) {
			Cliente2.Salario = Cliente2.Renda * 5.8;
			System.out.println(Cliente2.Salario);
		} else if (Cliente2.Renda >= 9001 && Cliente2.Renda <= 25000) {
			Cliente2.Salario = Cliente2.Renda * 15;
			System.out.println("Seu Imposto " + Cliente2.Salario);
		}else if (Cliente2.Renda >= 25001 && Cliente2.Renda <=35000) {
			Cliente2.Salario = Cliente2.Renda *27.5;
			System.out.println("Seu Imposto " + Cliente2.Salario);
		}else if (Cliente2.Renda >=35001 ) {
			Cliente2.Salario = Cliente2.Renda *30;
			System.out.println("Seu Imposto " + Cliente2.Salario);
		}
		if (Cliente3.Renda <= 4000) {
			System.out.println("Se Deu Bem");
		} else if (Cliente3.Renda >= 4001 && Cliente3.Renda <= 9000) {
			Cliente3.Salario = Cliente3.Renda * 5.8;
			System.out.println(Cliente3.Salario);
		} else if (Cliente3.Renda >= 9001 && Cliente3.Renda <= 25000) {
			Cliente3.Salario = Cliente3.Renda * 15;
			System.out.println("Seu Imposto " + Cliente3.Salario);
		}else if (Cliente3.Renda >= 25001 && Cliente3.Renda <=35000) {
			Cliente3.Salario = Cliente3.Renda *27.5;
			System.out.println("Seu Imposto " + Cliente3.Salario);
		}else if (Cliente3.Renda >=35001 ) {
			Cliente3.Salario = Cliente3.Renda *30;
			System.out.println("Seu Imposto " + Cliente3.Salario);
		}
		if (Cliente4.Renda <= 4000) {
			System.out.println("Se Deu Bem");
		} else if (Cliente4.Renda >= 4001 && Cliente4.Renda <= 9000) {
			Cliente4.Salario = Cliente4.Renda * 5.8;
			System.out.println(Cliente4.Salario);
		} else if (Cliente4.Renda >= 9001 && Cliente4.Renda <= 25000) {
			Cliente4.Salario = Cliente4.Renda * 15;
			System.out.println("Seu Imposto " + Cliente4.Salario);
		}else if (Cliente4.Renda >= 25001 && Cliente4.Renda <=35000) {
			Cliente4.Salario = Cliente4.Renda *27.5;
			System.out.println("Seu Imposto " + Cliente4.Salario);
		}else if (Cliente4.Renda >=35001 ) {
			Cliente4.Salario = Cliente4.Renda *30;
			System.out.println("Seu Imposto " + Cliente4.Salario);
		}
		
	}
}
