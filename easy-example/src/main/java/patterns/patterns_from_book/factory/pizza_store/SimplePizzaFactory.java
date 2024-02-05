package patterns.patterns_from_book.factory.pizza_store;


import patterns.patterns_from_book.factory.pizza_store.variety_of_pizzas.PepperoniPizza;
import patterns.patterns_from_book.factory.pizza_store.variety_of_pizzas.CheesePizza;
import patterns.patterns_from_book.factory.pizza_store.variety_of_pizzas.ClamPizza;
import patterns.patterns_from_book.factory.pizza_store.variety_of_pizzas.VeggiePizza;

//класс-калька для региональных фабрик
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;

    }
}
