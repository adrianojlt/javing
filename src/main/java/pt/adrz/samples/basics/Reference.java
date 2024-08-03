package pt.adrz.samples.basics;

public class Reference {
	
	public String field;
	
	public Reference(String field) {
		this.field = field;
	}

	/**
	 * Java is always pass-by-value and not by reference
	 * Here a new instance (address memory assigned to 'ref') is created 
	 * if Java was passed by reference the argument object would be changed, instead
	 * only the value of that variable ( address memory ) is changed
	 * @param ref
	 */
	public static Reference changeWithInstance(Reference ref) {
		ref = new Reference("new instance");
		return ref;
	}
	
	/**
	 * 'ref' is passed by value.
	 * any change to var 'ref' will be done only in the scope of this function.
	 * But we can change what is inside the object.
	 * @param ref
	 */
	public static void changeValue(Reference ref, String value) {
		ref.field = value;
	}
}
