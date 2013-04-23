package pt.adrz.myjavatutorial.designPatterns.factory;

public class NYStyleCheesePizza extends Pizza{

	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Mariara Sauce";
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
