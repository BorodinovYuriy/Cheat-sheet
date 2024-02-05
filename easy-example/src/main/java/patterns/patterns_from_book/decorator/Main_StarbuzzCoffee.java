package patterns.patterns_from_book.decorator;

public class Main_StarbuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.description+" $"+beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2.description+" $"+beverage2.cost());

        //пошли смеси:)
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.description+" $"+beverage2.cost());
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.description+" $"+beverage2.cost());
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.description+" $"+beverage2.cost());

    }
}
