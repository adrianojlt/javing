package pt.adrz.samples.patterns.strategy.bonus;

import pt.adrz.samples.challenges.refactors.bonus.PerformanceCategory;
import pt.adrz.samples.challenges.refactors.bonus.PersonalInfo;

public class PerformanceBonusStrategy implements BonusStrategy {

    @Override
    public double calculate(double salary, PersonalInfo info, PerformanceCategory category) {
        return switch (category) {
            case POOR -> salary * 0.1;
            case MEDIUM -> salary * 0.5;
            case EXCEPTIONAL -> salary;
            default -> throw new IllegalArgumentException("Unknown performance category: " + category);
        };
    }
}
