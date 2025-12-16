package pt.adrz.samples.patterns.strategy.validations;

import java.util.regex.Pattern;

public class EmailValidationRule implements RegistrationRule {
	
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	@Override
	public void validate(RegistrationData regData) {
		
		if ( !pattern.matcher(regData.getEmail()).matches() ) {
			throw new IllegalArgumentException("Email is not a valid email!");
		}
	}
}
