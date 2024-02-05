package patterns.patterns_from_book.factory.pizza_store.variety_of_pizzas.over_variety_of_pizza;


import patterns.patterns_from_book.factory.pizza_store.Pizza;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");//добавка - "реджано".
    }
}
