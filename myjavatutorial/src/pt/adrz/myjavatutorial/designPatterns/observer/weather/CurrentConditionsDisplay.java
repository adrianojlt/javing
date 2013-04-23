package pt.adrz.myjavatutorial.designPatterns.observer.weather;

/**
 * This class is the concrete observer of this Observer Pattern
 * @author adriano
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;

	/**
	 * this observer will be registered in the given subject 
	 * @param weatherData - The subject
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		
		this.temperature = temperature;
		this.humidity = humidity;
		display();	
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
