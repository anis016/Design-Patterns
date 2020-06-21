package com.patterns;

import com.patterns.behavior.IQuackBehavior;
import com.patterns.behavior.impl.NoFlyBehavior;
import com.patterns.behavior.impl.QuackBehavior;
import com.patterns.behavior.impl.SqueakQuackBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(String displayName) {
        super(displayName);
        setFlyBehavior();
        setQuackBehavior();
    }

    public void setFlyBehavior() {
        this.setFlyBehavior(new NoFlyBehavior());
    }

    public void setQuackBehavior() {
        super.setQuackBehavior(new SqueakQuackBehavior());
    }

    /*
     * Redundant method
     * */
    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        super.setQuackBehavior(new QuackBehavior());
    }
}
