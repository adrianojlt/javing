package pt.adrz.myjavatutorial.designPatterns.observer.weather;

/**
 * All weather components implements this interface. This gives the 
 * Subject a common interface to talk to when it comes time to update the observers
 * @author adriano
 *
 */
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
