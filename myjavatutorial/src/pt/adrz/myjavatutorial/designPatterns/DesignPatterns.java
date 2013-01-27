package pt.adrz.myjavatutorial.designPatterns;

import pt.adrz.myjavatutorial.designPatterns.decorator.Beverage;
import pt.adrz.myjavatutorial.designPatterns.decorator.CondimentMilk;
import pt.adrz.myjavatutorial.designPatterns.decorator.CondimentSoy;
import pt.adrz.myjavatutorial.designPatterns.decorator.Espresso;
import pt.adrz.myjavatutorial.designPatterns.decorator.HouseBlend;
import pt.adrz.myjavatutorial.designPatterns.observer.SwingObserverExample;

public class DesignPatterns {

	public DesignPatterns() {
		
	}
	
	public void tmp() {
	}
	
	public void swingObserverPatterns() {
		new SwingObserverExample();
	}
	
	public void coffeDecorator() {
		
		// order an expresso with no condiments
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " €" + espresso.cost());
		
		// order a HouseBlend with milk and soy
		Beverage houseBlend = new HouseBlend(); 
		houseBlend = new CondimentMilk(houseBlend);	// ... wrap it with Milk
		houseBlend = new CondimentSoy(houseBlend);	// ... wrap it with Soy
		System.out.println(houseBlend.getDescription() + " €" + houseBlend.cost());
	}
	
}
