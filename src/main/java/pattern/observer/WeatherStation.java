package pattern.observer;

import pattern.observer.observer.CurrentConditionsDisplay;
import pattern.observer.observer.ForecastDisplay;
import pattern.observer.observer.StatisticsDisplay;
import pattern.observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        displayFromAvailableDevices(currentConditionsDisplay, statisticsDisplay, forecastDisplay);
        weatherData.setMeasurements(82, 70, 29.2f);
        displayFromAvailableDevices(currentConditionsDisplay, statisticsDisplay, forecastDisplay);
        weatherData.setMeasurements(78, 90, 29.2f);
        displayFromAvailableDevices(currentConditionsDisplay, statisticsDisplay, forecastDisplay);
    }

    private static void displayFromAvailableDevices(
            CurrentConditionsDisplay currentConditionsDisplay,
            StatisticsDisplay statisticsDisplay,
            ForecastDisplay forecastDisplay
    ) {
        currentConditionsDisplay.display();
        statisticsDisplay.display();
        forecastDisplay.display();
    }
}
