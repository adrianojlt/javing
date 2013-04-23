package pt.adrz.myjavatutorial.designPatterns.factory;

public class NYPizzaStore extends PizzaStore {
	
	public NYPizzaStore() { }

	@Override
	protected Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if (type.equals("cheese")) { pizza = new NYStyleCheesePizza(); }
		else if (type.equals("pepperone")) { }
		else if (type.equals("clam")) { }
		else if (type.equals("veggie")) { }
		
		return pizza;
	}
}
