package pt.adrz.samples.patterns.strategy.bonus;

import pt.adrz.samples.challenges.refactors.bonus.PerformanceCategory;
import pt.adrz.samples.challenges.refactors.bonus.PersonalInfo;

public class ChildrenBonusStrategy implements BonusStrategy {
    @Override
    public double calculate(double salary, PersonalInfo info, PerformanceCategory perfCat) {

        if (info.numberOfChildren < 0) {
            return 0;
        }

        return info.numberOfChildren * 500;
    }
}
