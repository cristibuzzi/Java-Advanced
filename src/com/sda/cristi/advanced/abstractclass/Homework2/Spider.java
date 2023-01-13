package com.sda.cristi.advanced.abstractclass.Homework2;

public class Spider extends Animal {

    public Spider(int legs) {
        super(legs);
    }

    @Override
    public String walk() {
        return null;
    }

    @Override
    public int getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return "Sprider is walking with " + legs + " legs";
    }
}
