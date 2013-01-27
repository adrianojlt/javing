package pt.adrz.myjavatutorial.designPatterns.decorator;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		this.description = "House Blend Coffe";
	}
	
	public double cost() {
		return .89;
	}

}
