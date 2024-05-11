package pt.adrz.samples.basics;

public class Reference {
	
	public String field;
	
	public Reference(String field) {
		this.field = field;
	}
	
	public static void main(String[] args) {

		Reference ref = new Reference("first Object");

		System.out.println(ref.field);
		changeValue(ref);
		System.out.println(ref.field);
		changeWithInstance(ref);
		System.out.println(ref.field);

	}
	
	/**
	 * Java is always pass-by-value and not by reference
	 * Here a new instance (address memory assigned to 'ref') is created 
	 * if Java was passed by reference the argument object would be changed, instead
	 * only the value of that variable ( address memory) is changed
	 * @param ref
	 */
	public static void changeWithInstance(Reference ref) {
		ref = new Reference("new instance");
	}
	
	/**
	 * Here the object referenced by variable 'ref' is modified
	 * @param ref
	 */
	public static void changeValue(Reference ref) {
		ref.field = "changed field";
	}
}
