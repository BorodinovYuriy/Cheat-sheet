package patterns.patterns_from_book.factory.pizza_store;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;//тесто
    protected String sauce;//соус
    protected ArrayList toppings = new ArrayList();//начинки

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");

        for (int i = 0; i < toppings.size(); i++){
            System.out.println("   " + toppings.get(i));
        }
    }
    //выпечка
    protected void  bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    //нарезка
    protected void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    //упаковка
    protected void box(){
        System.out.println("Place pizza in PizzaStore box");
    }

    public String getName(){
        return name;
    }

}
