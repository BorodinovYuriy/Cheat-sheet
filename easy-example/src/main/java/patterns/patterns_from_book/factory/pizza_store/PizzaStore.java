package patterns.patterns_from_book.factory.pizza_store;

//Магазин магазинов...
public abstract class PizzaStore {

    //делегирует создание пиццы наследникам
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //такая реализация позволяет строить пиццу другими фабриками с учётом региональных особенностей.
    //субклассы переопределяют метод createPizza(String type).
    protected abstract Pizza createPizza(String type);
    //другие методы
}
