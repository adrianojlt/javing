package pt.adrz.myjavatutorial.designPatterns.strategy;



public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("All ducks float, even decoys");
	}
	
	public void performFly() {
		flyBehavior.fly(); // delegate to the behavior class
	}
	
	public void quack() {
		quackBehavior.quack();
	}
	
}






class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
}

class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I can't fly!!");
	}
}

class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Quack!!!");
	}
}

class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}
}

class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeak!!");
	}
}

class ModelDuck extends Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'am a model duck");
	}
	
}

class MallardDuck extends Duck {
	
	public MallardDuck() {
		
	}
	
	public void display() {
		
	}
	
}
class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		
	}

	public void display() {
		
	}
	
}