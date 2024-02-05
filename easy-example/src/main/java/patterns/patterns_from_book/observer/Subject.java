package patterns.patterns_from_book.observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();//Оповещение наблюдателей
}
