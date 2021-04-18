package pattern.observer.observer;

import pattern.observer.subject.WeatherData;

public class StatisticsDisplay implements Observer, Display {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int readingsCount;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / readingsCount) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update() {
        float temperatureReading = weatherData.getTemperature();
        tempSum += temperatureReading;
        readingsCount++;
        if (temperatureReading > maxTemp) {
            maxTemp = temperatureReading;
        }
        if (temperatureReading < minTemp) {
            minTemp = temperatureReading;
        }
    }
}
