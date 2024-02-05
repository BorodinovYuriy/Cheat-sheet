package patterns.patterns_from_book.strategy.duck_pattern.flying_class;


import patterns.patterns_from_book.strategy.duck_pattern.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("do flying");
    }
}
