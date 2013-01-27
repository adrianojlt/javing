package pt.adrz.myjavatutorial.designPatterns.decorator;

public class CondimentSoy extends CondimentDecorator {

	Beverage beverage;
	
	public CondimentSoy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}
}
