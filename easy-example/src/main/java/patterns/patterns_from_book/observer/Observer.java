package patterns.patterns_from_book.observer;

//Реализуется всеми наблюдателями
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
