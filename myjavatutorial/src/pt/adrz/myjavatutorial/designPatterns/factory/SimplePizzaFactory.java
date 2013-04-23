package pt.adrz.myjavatutorial.designPatterns.factory;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if (type.equals("cheese")) { pizza = new PizzaCheese();}
		else if (type.equals("pepperone")) { }
		else if (type.equals("clam")) { }
		else if (type.equals("veggie")) { }
		
		return pizza;
	}

}

class PizzaCheese extends Pizza {

	@Override
	public void prepare() {
		
	}

	@Override
	public void bake() {
		
	}

	@Override
	public void cut() {
		
	}

	@Override
	public void box() {
		
	}
	
}

