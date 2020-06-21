package com.patterns;

import com.patterns.behavior.impl.FlyBehavior;
import com.patterns.behavior.impl.QuackBehavior;

public class NormalDuck extends Duck {

    public NormalDuck(String displayName) {
        super(displayName);
        setFlyBehavior();
        setQuackBehavior();
    }

    public void setFlyBehavior() {
        super.flyBehavior = new FlyBehavior();
    }

    public void setQuackBehavior() {
        super.quackBehavior = new QuackBehavior();
    }
}
