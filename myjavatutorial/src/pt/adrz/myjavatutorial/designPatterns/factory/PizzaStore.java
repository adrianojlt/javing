package pt.adrz.myjavatutorial.designPatterns.factory;

public abstract class PizzaStore {
	
	SimplePizzaFactory factory;
	
	public PizzaStore() { }
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
		// Notice that we've replaced the new operator with a create 
		// method on the factory object. No more concrete instantiation here
		//pizza = factory.createPizza(type);
		
		// ... now createPizza is back to being a call to a method in the PizzaStore (factory method)
		// rather than on a factory object ...
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// ... now we have moved our factory object to this method
	// all the responsibility for instantiating Pizzas has been moved into a method
	// that act as a factor
	protected abstract Pizza createPizza(String type);
}

