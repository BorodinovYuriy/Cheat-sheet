package patterns.patterns_from_book.singletone;

public class Main_Singleton {
    public static void main(String[] args) {

        //Создать второй объект или через new - не получится
        Singleton singleton = Singleton.getInstance();


    }
}
