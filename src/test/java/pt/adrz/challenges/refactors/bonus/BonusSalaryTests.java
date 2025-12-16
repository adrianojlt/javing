package pt.adrz.challenges.refactors.bonus;

import org.junit.jupiter.api.Test;
import pt.adrz.samples.challenges.refactors.bonus.BonusSalary;
import pt.adrz.samples.challenges.refactors.bonus.PersonalInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusSalaryTests {

    @Test
    void calculatesBonusForPoorPerformanceWithoutChildren() {
        BonusSalary calculator = new BonusSalary();
        PersonalInfo info = new PersonalInfo();
        info.hasChildren = false;
        info.numberOfChildren = 0;

        double bonus = calculator.oldCalc(10000, "poor", info);
        assertEquals(1000, bonus, 0.01);
    }

    @Test
    void calculatesBonusForMediumPerformanceWithoutChildren() {
        BonusSalary calculator = new BonusSalary();
        PersonalInfo info = new PersonalInfo();
        info.hasChildren = false;

        double bonus = calculator.oldCalc(10000, "medium", info);
        assertEquals(5000, bonus, 0.01);
    }

    @Test
    void calculatesBonusForUnrecognizedPerformanceCategory() {
        BonusSalary calculator = new BonusSalary();
        PersonalInfo info = new PersonalInfo();
        info.hasChildren = false;

        double bonus = calculator.oldCalc(10000, "excellent", info);
        assertEquals(0, bonus, 0.01);
    }

    @Test
    void addsChildBonusWhenHasChildrenIsTrue() {
        BonusSalary calculator = new BonusSalary();
        PersonalInfo info = new PersonalInfo();
        info.hasChildren = true;
        info.numberOfChildren = 2;

        double bonus = calculator.oldCalc(10000, "poor", info);
        assertEquals(2000, bonus, 0.01);
    }

    @Test
    void ignoresNumberOfChildrenWhenHasChildrenIsFalse() {
        BonusSalary calculator = new BonusSalary();
        PersonalInfo info = new PersonalInfo();
        info.hasChildren = false;
        info.numberOfChildren = 3; // should be ignored

        double bonus = calculator.oldCalc(10000, "medium", info);
        assertEquals(5000, bonus, 0.01);
    }
}
