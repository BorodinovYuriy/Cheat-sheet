package patterns.patterns_from_book.strategy.duck_pattern.quacking_class;


import patterns.patterns_from_book.strategy.duck_pattern.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
