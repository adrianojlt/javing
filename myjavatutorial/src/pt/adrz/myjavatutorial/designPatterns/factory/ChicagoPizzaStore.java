package pt.adrz.myjavatutorial.designPatterns.factory;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if (type.equals("cheese")) { }
		else if (type.equals("pepperone")) { }
		else if (type.equals("clam")) { }
		else if (type.equals("veggie")) { }
		
		return pizza;
	}
}
