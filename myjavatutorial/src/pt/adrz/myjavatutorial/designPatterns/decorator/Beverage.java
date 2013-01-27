package pt.adrz.myjavatutorial.designPatterns.decorator;

public abstract class Beverage {

	String description = "unknow beverage";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}



	
