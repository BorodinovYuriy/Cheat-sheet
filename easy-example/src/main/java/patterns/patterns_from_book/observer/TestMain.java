package patterns.patterns_from_book.observer;

//Weather station - тест погодной станции
public class TestMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        //Задаём погоду и выводим на печать из наблюдателя только 2 параметра.
        //Можно теперь добавлять наблюдателей и т.д.
        weatherData.setMeasurements(80, 65, 30);
    }
}
