package com.patterns;

import com.patterns.behavior.impl.MuteQuackBehavior;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck("RubberDuck");
        System.out.println(rubberDuck);

        Duck normalDuck = new NormalDuck("NormalDuck");
        System.out.println(normalDuck);

        System.out.println("\nChanging a behavior of the Rubber Duck");
        rubberDuck.setQuackBehavior(new MuteQuackBehavior()); // changing a behavior dynamically
        System.out.println(rubberDuck);
    }
}
