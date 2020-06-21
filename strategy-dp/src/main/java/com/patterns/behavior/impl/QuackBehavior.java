package com.patterns.behavior.impl;

import com.patterns.behavior.IQuackBehavior;

public class QuackBehavior implements IQuackBehavior {

    @Override
    public String quack() {
        return "I can Quack";
    }
}
