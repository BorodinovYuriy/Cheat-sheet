package patterns.patterns_from_book.decorator;

//Декоратор для различных добавок к напиткам
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
