package com.patterns;

import com.patterns.behavior.IFlyBehavior;
import com.patterns.behavior.IQuackBehavior;

public abstract class Duck {

    String displayName;
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public Duck() {
        this.displayName = "UNNAMED";
    }

    public Duck(String displayName) {
        this.displayName = displayName;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public String performFly() {
        return flyBehavior.fly();
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public String performQuack() {
        return quackBehavior.quack();
    }

    @Override
    public String toString() {
        return String.format("Duck{displayName='%s', flyBehavior=%s, quackBehavior=%s}", displayName, performFly(), performQuack());
    }
}