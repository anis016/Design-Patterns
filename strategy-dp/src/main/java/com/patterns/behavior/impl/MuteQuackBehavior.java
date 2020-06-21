package com.patterns.behavior.impl;

import com.patterns.behavior.IQuackBehavior;

public class MuteQuackBehavior implements IQuackBehavior {

    @Override
    public String quack() {
        return "I can not Quack";
    }
}
