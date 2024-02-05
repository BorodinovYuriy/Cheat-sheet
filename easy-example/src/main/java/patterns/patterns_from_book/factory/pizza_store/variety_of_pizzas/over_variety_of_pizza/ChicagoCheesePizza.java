package patterns.patterns_from_book.factory.pizza_store.variety_of_pizzas.over_variety_of_pizza;


import patterns.patterns_from_book.factory.pizza_store.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thin Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");//добавка - "моцарелла".
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
