package patterns.patterns_from_book.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private  ArrayList observers;
    private float temperature;//температура
    private float humidity;//влажность
    private float pressure;//давление

    public WeatherData(){
        //Выделение памяти под Список наблюдателей
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Object o : observers) {
            Observer observer = (Observer) o;
            //Связались с интерфейсом Observer через (Observer) и вызвали метод update для наблюдателей.
            observer.update(temperature, humidity, pressure);
        }
    }
    //Оповещение наблюдателей о появлении новых данных
    public void measurementChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        //изменение данных
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //оповещение
        measurementChanged();
    }
}
















