package pt.adrz.myjavatutorial.designPatterns.decorator;

public class CondimentMilk extends CondimentDecorator{

	Beverage beverage;
	
	public CondimentMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
}
