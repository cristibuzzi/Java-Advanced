package com.sda.cristi.advanced.abstractclass.Homework2;

public abstract class Animal {
    public int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    public abstract String walk();
}
