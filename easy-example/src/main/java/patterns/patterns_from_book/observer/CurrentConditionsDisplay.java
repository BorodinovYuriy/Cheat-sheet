package patterns.patterns_from_book.observer;

//класс Подписоты
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;//температура
    private float humidity;//влажность

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        //появляется метод регистрации, регистрируем в WeatherData наблюдателя.
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " and humidity " + humidity);
    }


}
