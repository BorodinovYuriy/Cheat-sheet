package patterns.patterns_from_book.factory.pizza_store.store;


import patterns.patterns_from_book.factory.pizza_store.Pizza;
import patterns.patterns_from_book.factory.pizza_store.PizzaStore;

//ещё один класс фабрики — не описаны классы реализации new... поэтому закомичен
public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;

        /*if (type.equals("cheese")){
            pizza = new CaliforniaCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new CaliforniaPepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new CaliforniaClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new CaliforniaVeggiePizza();
        }*/
        return pizza;

    }
}
