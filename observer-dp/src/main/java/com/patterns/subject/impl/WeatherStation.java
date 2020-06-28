package com.patterns.subject.impl;

import com.patterns.subject.ISubject;
import com.patterns.subscribers.IObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class WeatherStation implements ISubject {

    private String forecast; // state
    private final List<IObserver> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public String getForecast() {
        return this.forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    @Override
    public void addObserver(IObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        } else {
            System.out.println(observer + " already exists");
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        } else {
            throw new NoSuchElementException(observer + " not found");
        }
    }

    @Override
    public void notifyAllObservers() {
        for (IObserver observer : observers) {
            observer.updateObserver(this.getForecast());
        }
    }

    public void publishForecast() {
        notifyAllObservers();
    }

    @Override
    public String toString() {
        return String.format("WeatherStation{forecast='%s'}", forecast);
    }
}
