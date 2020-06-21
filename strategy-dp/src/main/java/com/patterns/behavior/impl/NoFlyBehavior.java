package com.patterns.behavior.impl;

import com.patterns.behavior.IFlyBehavior;

public class NoFlyBehavior implements IFlyBehavior {

    @Override
    public String fly() {
        return "I can not Fly";
    }
}
