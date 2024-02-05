package patterns.patterns_from_book.strategy.duck_pattern;


import patterns.patterns_from_book.strategy.duck_pattern.real_duck.TestDuck;
import patterns.patterns_from_book.strategy.duck_pattern.flying_class.FlyNoWay;
import patterns.patterns_from_book.strategy.duck_pattern.quacking_class.MuteQuack;

public class Main {
    public static void main(String[] args) {
        TestDuck testDuck = new TestDuck();
        testDuck.performQuack();
        testDuck.performFly();

        testDuck.display();

        //смена поведения
        System.out.println("\n-------------------\n");

        testDuck.setFlyBehavior(new FlyNoWay());
        testDuck.setQuackBehavior(new MuteQuack());
        testDuck.performFly();
        testDuck.performQuack();
        testDuck.display();

    }
}
