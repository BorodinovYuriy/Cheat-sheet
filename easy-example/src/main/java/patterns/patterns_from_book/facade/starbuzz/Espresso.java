package patterns.patterns_from_book.facade.starbuzz;

public class Espresso extends  Beverage{

    public Espresso(){
        //Конструктор знает о переменной description из родителя
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
