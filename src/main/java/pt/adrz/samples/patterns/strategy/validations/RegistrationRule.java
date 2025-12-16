package pt.adrz.samples.patterns.strategy.validations;

public interface RegistrationRule {
	void validate(RegistrationData regData);
}
