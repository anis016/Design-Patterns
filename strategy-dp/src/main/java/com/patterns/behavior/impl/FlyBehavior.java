package com.patterns.behavior.impl;

import com.patterns.behavior.IFlyBehavior;

public class FlyBehavior implements IFlyBehavior {

    @Override
    public String fly() {
        return "I can Fly";
    }
}
