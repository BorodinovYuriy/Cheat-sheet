package patterns.patterns_from_book.facade.starbuzz;

//класс Напиток (основной абстрактный, от которого все наследуются)
//--можно было сделать интерфейсом--
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
