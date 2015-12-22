package pt.adrz.myjavatutorial.diagrams;

public class Diagram {
	
	public class Dependency {
		
		// ... here we see a DEPENDENCY because a class reference is passed as 
		// a method parameter. This class dont own a B instance
		public void doSomething(B b) {
			// do something with b ...
		}
	}
	
	// Agregation and composition are special types of ASSOCIATION ...
	public class Association {

		private B b;
		
		public B getB() { return this.b; }
	}
	
	// Agregation is the weaker form of object containment (one object contains other objects)
	// When this instance goes out of scope (e.g garbage collected) the b instance
	// does not (of necessity) go out of scope.
	public class Aggregation {
		
		private B b;
		
		//  if a reference is stored inside the class we have a different relationshitp called AGREGATION
		public void setB(B b) { this.b = b; }
	}
	
	// The stronger form of object containment is called COMPOSITION.
	// The containing object is responsible for the creation and life cycle of 
	// the contained object (either directly or indirectly) ..
	public class Composition {

		// Via member initialization
		private B b = new B();

		// ... via constructor initizalization.
		public Composition() {
			this.b = new B();
		}
		
		// ... or via lazy init
		public int doSomethingUniqueToB() {
			if ( this.b == null ) this.b = new B();
			return b.randomNumber();
		}
	}

	public class B {
		
		public int randomNumber() {
			return 3; // :)
		}
	}
	
	// inheritance is the use  of extends keywork ...
	// and realization is the use of interfaces ...
}

	
