package patterns.patterns_from_book.adapter;

public class MainTestAdapter {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        //упаковка в адаптер
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\n");

        System.out.println("The Duck says...");
        //тест утки
        testDuck(duck);
        System.out.println("\n");

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    //теперь метод получает объект Duck и вызывает его методы
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
