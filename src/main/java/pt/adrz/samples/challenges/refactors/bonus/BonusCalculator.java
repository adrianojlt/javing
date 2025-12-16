package pt.adrz.samples.challenges.refactors.bonus;

import pt.adrz.samples.patterns.strategy.bonus.BonusStrategy;

import java.util.List;

// since this an immutable data carrier, we can use a record instead of a class
public record BonusCalculator(List<BonusStrategy> strategies) {

    public double calculateTotalBonus(double salary, PersonalInfo info, PerformanceCategory perfCat) {
        return strategies.stream()
                .mapToDouble(strategy -> strategy.calculate(salary, info, perfCat))
                .sum();
    }
}
