package pt.adrz.myjavatutorial.designPatterns;

import pt.adrz.myjavatutorial.designPatterns.decorator.Beverage;
import pt.adrz.myjavatutorial.designPatterns.decorator.CondimentMilk;
import pt.adrz.myjavatutorial.designPatterns.decorator.CondimentSoy;
import pt.adrz.myjavatutorial.designPatterns.decorator.Decaf;
import pt.adrz.myjavatutorial.designPatterns.decorator.Espresso;
import pt.adrz.myjavatutorial.designPatterns.decorator.HouseBlend;
import pt.adrz.myjavatutorial.designPatterns.factory.*;
//import pt.adrz.myjavatutorial.designPatterns.factory.PizzaStore;
import pt.adrz.myjavatutorial.designPatterns.observer.SwingObserverExample;
import pt.adrz.myjavatutorial.designPatterns.observer.weather.CurrentConditionsDisplay;
import pt.adrz.myjavatutorial.designPatterns.observer.weather.ForecastDisplay;
import pt.adrz.myjavatutorial.designPatterns.observer.weather.WeatherData;

public class DesignPatterns {

	public DesignPatterns() {
		
	}
	
	public void tmp() {
	}
	
	public void swingObserver() {
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
		
		// order a Decaf ...
		Beverage decaf = new Decaf();
		
		decaf = new CondimentMilk(decaf); 	// ... wrap it with Milk
		decaf = new CondimentMilk(decaf); 	// ... wrap it with more Milk
		decaf = new CondimentSoy(decaf); 	// ... wrap it with Soy
		
		System.out.println(decaf.getDescription() + " €" + decaf.cost());
	}
	
	public void pizzaFactory() {
		
		PizzaStore nyStore = new NYPizzaStore();
	}
	
	public void weatherObserver() {
		
		WeatherData weatherData = new WeatherData();
		
		// create the "displays" and pass the weatherData obj
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		// simulate the weather measurements
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 23.2f);
		weatherData.setMeasurements(78, 45, 40.4f);
	}
}
