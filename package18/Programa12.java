package package18;

import java.time.LocalDate;


public class Programa12 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Dados julio = new Dados("Julio Cesar", LocalDate.of(1995,6,4));
		System.out.println("DN: "+ julio.dn);
		System.out.println(julio.getDn().getDayOfWeek());
		System.out.println(julio.getDn().getDayOfMonth());
		System.out.println(julio.getDn().isLeapYear());

		Dados Helena = new Dados("Helena Talyta", LocalDate.of(1995,5 , 30));
		System.out.println("DN: "+ Helena.dn);
		System.out.println(Helena.getDn().getDayOfWeek());
		System.out.println(Helena.getDn().getDayOfMonth());
		System.out.println(Helena.getDn().isLeapYear());
		
		Dados Antonio = new Dados("Antonio jose",LocalDate.of(1964, 5, 12));
		System.out.println("DN: "+ Antonio.dn);
		System.out.println(Antonio.getDn().getDayOfWeek());
		System.out.println(Antonio.getDn().getDayOfMonth());
		System.out.println(Antonio.getDn().isLeapYear());
		
		System.out.println("Diferença "+julio.dn.equals(Antonio.dn));
		System.out.println(Antonio.compareTo(Helena));
		


		
	
		
	}

}
