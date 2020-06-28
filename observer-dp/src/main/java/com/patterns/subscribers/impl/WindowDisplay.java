package com.patterns.subscribers.impl;

import com.patterns.subject.impl.WeatherStation;
import com.patterns.subscribers.IDisplayState;
import com.patterns.subscribers.IObserver;

public class WindowDisplay implements IObserver, IDisplayState {
    private String forecast;
    private WeatherStation weatherStation;

    public WindowDisplay() {
    }

    public void subscribeTo(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    public void unsubscribeFrom(WeatherStation weatherStation) {
        this.weatherStation = null;
        weatherStation.removeObserver(this);
    }

    @Override
    public void updateObserver(String forecast) {
        this.forecast = forecast;
        display();
    }

    @Override
    public void display() {
        System.out.println("Window want to display: " + this.forecast);
    }
}