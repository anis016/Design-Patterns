package com.patterns.subject;

import com.patterns.subscribers.IObserver;

public interface ISubject {

    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyAllObservers();
}