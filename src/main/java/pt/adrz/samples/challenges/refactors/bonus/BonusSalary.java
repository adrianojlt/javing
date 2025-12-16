package pt.adrz.samples.challenges.refactors.bonus;

import pt.adrz.samples.patterns.strategy.bonus.ChildrenBonusStrategy;
import pt.adrz.samples.patterns.strategy.bonus.PerformanceBonusStrategy;

import java.util.List;

public class BonusSalary {

    public double oldCalc(double Salary, String performanceCategory, PersonalInfo info) {

        double bonus = 0;

        if (performanceCategory.equals("poor"))
            bonus += Salary * 0.1;
        else if (performanceCategory.equals("medium"))
            bonus += Salary * 0.5;

        if (info.hasChildren) {
            bonus += 500 * info.numberOfChildren;
        }

        return bonus;
    }

    public double newCalc(double salary, PerformanceCategory performanceCategory, PersonalInfo info) {

        double bonus = 0;

        bonus += this.getPerformanceBonus(salary, performanceCategory);
        bonus += this.getChildrenBonus(info.numberOfChildren);

        return bonus;
    }

    public double calcWithStrategy(double salary, PerformanceCategory performanceCategory, PersonalInfo info) {

        var calculator = new BonusCalculator(List.of(
                new PerformanceBonusStrategy(),
                new ChildrenBonusStrategy()
        ));

        return calculator.calculateTotalBonus(salary, info, performanceCategory);
    }

    private double getPerformanceBonus(double salary, PerformanceCategory performanceCategory) {

        return switch (performanceCategory) {
            case POOR -> salary * 0.1;
            case MEDIUM -> salary * 0.5;
            case EXCEPTIONAL -> salary;
            default -> throw new IllegalArgumentException("Unknown performance category: " + performanceCategory);
        };
    }

    private double getChildrenBonus(int numberOfChildren) {
        return numberOfChildren * 500;
    }
}
