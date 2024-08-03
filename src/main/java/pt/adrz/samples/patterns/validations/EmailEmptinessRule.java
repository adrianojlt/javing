package pt.adrz.samples.patterns.validations;

public class EmailEmptinessRule implements RegistrationRule {

    @Override
    public void validate(RegistrationData regData) {
        if (regData.getEmail() == null || regData.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email is empty!");
        }
    }
}