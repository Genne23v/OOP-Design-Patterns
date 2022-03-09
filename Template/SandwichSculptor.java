package Template;

public class SandwichSculptor {

	public static void main(String[] args) {

		Hoagie cust1Hoagie = new ItalianHoagie();
		cust1Hoagie.makeSandwich();
		
		System.out.println();
		
		Hoagie cust2Hoagie = new VeggieHoagie();
		cust2Hoagie.makeSandwich();

	}

}
