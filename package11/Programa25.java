package package11;

public class Programa25 {

	public static void main(String[] args) {
		Cliente julio= new Cliente ("Julio Cesar", "Rua Anitapolis,270"); 
		Cliente Helena=new Cliente ("Helena Talyra","Rua Anitapolis,280");
		
		Conta conta01= new Conta(1,100.0f,500.0f,julio);
		Conta conta02= new Conta(2,600.0f,900.0f,Helena);
		
		System.out.println("Saldo Julio; "+ conta01.getSaldo());
		System.out.println("Saldo Helena; "+ conta02.getSaldo());
		
		conta01.sacar(600);
		System.out.println("Saldo Conta 01 "+ conta01.getSaldo());
		//conta01.limite=10;
		//System.out.println("Saldo Conta Julio Limite Forçado"+ conta01.limite);
	}

}
