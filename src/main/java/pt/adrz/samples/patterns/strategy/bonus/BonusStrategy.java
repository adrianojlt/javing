package pt.adrz.samples.patterns.strategy.bonus;

import pt.adrz.samples.challenges.refactors.bonus.PerformanceCategory;
import pt.adrz.samples.challenges.refactors.bonus.PersonalInfo;

public interface BonusStrategy {
    double calculate(double salary, PersonalInfo info, PerformanceCategory perfCat);
}
