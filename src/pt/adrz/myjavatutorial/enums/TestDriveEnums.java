package pt.adrz.myjavatutorial.enums;

public class TestDriveEnums {

	public static void main(String[] args) {
		
		double earthWeight = 90;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		
		for ( Planet p : Planet.values() ) {
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
		}
	}
	
	private static void testOperations() {

		double x = 200;
		double y = 30;

		for (Operation op : Operation.values()) {
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
		}
	}
}
