package pattern.observer.observer;

import pattern.observer.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {
    WeatherData weatherData;
    private float temperature;
    private float pressure;
    private float humidity;

    // Note - this is also weird. This is not programming to an interface. Keeping it as is to make things easy.
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();
        this.humidity = weatherData.getHumidity();
    }
}
