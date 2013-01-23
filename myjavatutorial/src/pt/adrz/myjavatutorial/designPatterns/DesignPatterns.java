package pt.adrz.myjavatutorial.designPatterns;

public class DesignPatterns {

	private Duck duck;
	private MallardDuck mDuck;
	private RedheadDuck rDuck;
	
	public DesignPatterns() {
		//this.duck = new Duck();
		this.mDuck = new MallardDuck();
		this.rDuck = new RedheadDuck();
	}
	
	public void tmp() {
		this.duck.quack();
		this.mDuck.quack();
	}
	
}
