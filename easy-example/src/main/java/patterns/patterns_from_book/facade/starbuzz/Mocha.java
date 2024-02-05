package patterns.patterns_from_book.facade.starbuzz;

//Один из классов декоратора...остальные писать по аналогии
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    //При создании передаем конструктору класс напитка
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return 0.20 + beverage.cost();
    }
}
