package pt.adrz.myjavatutorial.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum FieldType {
	
	PASSWORD("password") {

		@Override
		boolean validate(String fieldValue) {
			return Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,})",fieldValue);
		}
		
	},
	
	EMAIL_ADDRESS("email") {

		@Override
		boolean validate(String fieldValue) {
			return Pattern.matches("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z|a-z]{2,4}$",fieldValue);
		}
	},
	
	PHONE_NUMBER("phone") {

		@Override
		boolean validate(String fieldValue) {
			return Pattern.matches("^1?[- ]?\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",fieldValue);
		}
	};

	private String fieldName;
	
	private FieldType(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public String getFieldName() {
		return this.fieldName;
	}
	
	abstract boolean validate(String fieldValue);

	private static final Map<String,FieldType> nameToFieldTypeMap = new HashMap<String, FieldType>();
	
	public static FieldType lookup(String fieldName) {
		return nameToFieldTypeMap.get(fieldName.toLowerCase());
	}
	
	static {
		for ( FieldType field : FieldType.values() ) {
			nameToFieldTypeMap.put(field.getFieldName(), field);
		}
	}
}
