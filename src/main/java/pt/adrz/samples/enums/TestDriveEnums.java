package pt.adrz.samples.enums;

public class TestDriveEnums {

	public static void main(String[] args) {
		testPlanets();
//		testOperations();
//		testPayrollDay();
//		testExample();
		testStatus();
//		testFieldType();
	}
	
	private static void testFieldType() {
		
		String fieldName = "password";
		String fieldValue = "1234";
		FieldType field = FieldType.lookup(fieldName);
		System.out.println(field.getFieldName() + "(\"" + fieldValue + "\") valid: " + field.validate(fieldValue));
	}
	
	private static void testPlanets() {

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
	
	private static void testPayrollDay() {

		double total = PayrollDay.FRIDAY.pay(10, 1);
		System.out.println("total pay = " + total);
	}

	private static void testExample() {

		Level example = Level.NORMAL;
		System.out.println("Level code: " + example.getLevelCode());
	}
	
	private static void testStatus() {

        System.out.println(Status.PASSED);
        System.out.println(Status.getStatus(-1));
        System.out.println(Status.getStatus(0));
	}
}
