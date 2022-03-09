package Template;

public class ItalianHoagie extends Hoagie {

	String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
	String[] cheeseUsed = {"Provolone" };
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	
	public void cutBun() {
		System.out.println("The Hoagie is cut");
	}

	@Override
	void addMeat() {
		System.out.print("Adding the meat: ");
		
		for (String meat : meatUsed) {
			System.out.print(meat + " ");
		}
	}

	@Override
	void addCheese() {
		System.out.print("Adding the cheese: ");
		
		for (String cheese : cheeseUsed) {
			System.out.print(cheese + " ");
		}
	}

	@Override
	void addVegetables() {
		System.out.print("Adding the veggies: ");
		
		for (String veggie : veggiesUsed) {
			System.out.print(veggie + " ");
		}
	}

	@Override
	void addCondiments() {
		System.out.print("Adding the condiments: ");
		
		for (String condiment : condimentsUsed) {
			System.out.print(condiment + " ");
		}
	}
}
