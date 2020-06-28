package com.patterns;

import com.patterns.subject.impl.WeatherStation;
import com.patterns.subscribers.impl.PhoneDisplay;
import com.patterns.subscribers.impl.WindowDisplay;

import java.util.concurrent.TimeUnit;

public class WeatherStationSimulator {

    public static void main(String[] args) throws InterruptedException {

        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        WindowDisplay windowDisplay = new WindowDisplay();

        // Subscribing to weather station subject
        phoneDisplay.subscribeTo(weatherStation);
        windowDisplay.subscribeTo(weatherStation);

        System.out.println("Adding new state for forecast");
        weatherStation.setForecast("Today it is going to rain");
        weatherStation.publishForecast();

        TimeUnit.SECONDS.sleep(2);

        System.out.println("\nAdding new state for forecast");
        weatherStation.setForecast("Tomorrow is sunny morning");
        weatherStation.publishForecast();

        // Unsubscribe window display from weather station subject
        windowDisplay.unsubscribeFrom(weatherStation);

        TimeUnit.SECONDS.sleep(2);

        System.out.println("\nAdding new state for forecast");
        weatherStation.setForecast("Gloomy Thursday");
        weatherStation.publishForecast();
    }
}
