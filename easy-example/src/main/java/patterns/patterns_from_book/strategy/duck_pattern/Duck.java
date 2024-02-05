package patterns.patterns_from_book.strategy.duck_pattern;
//абстрактный класс с реализацией связей интерфейсов и реальных уток
public abstract class Duck {
    //создание экземпляров интерфейса
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    //создание взаимодействия через интерфейсы
    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
    //остальные методы
    public void swim(){
        System.out.println("do swimming");
    }

    //добавление возможности менять поведение на лету в Main
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

//другие методы();

}
