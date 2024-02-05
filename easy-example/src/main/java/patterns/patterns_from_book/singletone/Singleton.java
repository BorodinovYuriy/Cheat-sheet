package patterns.patterns_from_book.singletone;

public class Singleton {
    //Переменная для уникального объекта.
    private static Singleton uniqueInstance;
    //...другие переменные...

    //Приватный конструктор, что бы вызывать его только через метод в классе Singleton.
    //А в нашем случае - вообще не вызывать:)
    private Singleton(){}

    //метод создания синхронизированного экземпляра, что бы не смогли обратиться два потока к примеру.
    public static synchronized Singleton getInstance(){
        //Ограничение на создание только одного экземпляра
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        System.out.println("i am unique");
        return uniqueInstance;
    }
    //Другие методы

}
/**
 * Либо объект создается заранее:
 *
 * public class Singleton {
 *
 * private static Singleton uniqueInstance = new Singleton();
 *
 * private Singleton(){}
 *
 * public static Singleton getInstance(){
 * return uniqueInstance;
 *    }
 *
 * }
 * ---------
 * Можно воспользоваться условной блокировкой через volatile
 * если цена синхронизации высока и синхронизироваться уже в блоке if после условия,
 * хотя это такое себе....
 *
 */