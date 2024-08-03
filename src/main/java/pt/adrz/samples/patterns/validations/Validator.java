package pt.adrz.samples.patterns.validations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Validator {

	private static String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private final List<String> forbiddenDomains = Arrays.asList("domain1", "domain2");
	
	public void chunky_register(String email, String name, int age) {

		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		
		if ( email == null || email.trim().equals("")){
			throw new IllegalArgumentException("Email should not be empty!");
		}
		if ( !pattern.matcher(email).matches()) {
			throw new IllegalArgumentException("Email is not a valid email!");
		}
		if ( forbiddenDomains.contains(email)){
			throw new IllegalArgumentException("Email belongs to a forbidden email");
		}
		if ( name == null || name.trim().equals("")){
			throw new IllegalArgumentException("Name should not be empty!");
		}
		if ( !name.matches("[a-zA-Z]+")){
			throw new IllegalArgumentException("Name should contain only characters");
		}
		if ( age <= 18){
			throw new IllegalArgumentException("Age should be greater than 18");
		}
	}
	
	public void clean_register(RegistrationData regData) {

		List<RegistrationRule> rules = new ArrayList<RegistrationRule>();

		rules.add(new EmailValidationRule());
		rules.add(new EmailEmptinessRule());

		/*
		rules.add(new EmailEmptinessRule());
		rules.add(new ForbiddenEmailDomainsRule());
		rules.add(new NameEmptinessRule());
		rules.add(new AlphabeticNameRule());
		*/
		  
		for ( RegistrationRule rule : rules){
			rule.validate(regData);
		}
	}
}
