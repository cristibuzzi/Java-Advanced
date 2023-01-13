package com.sda.cristi.advanced.abstractclass.Homework2;

public class Cat extends Animal {

    public Cat(int legs) {
        super(legs);
    }

    @Override
    public String walk() { return null; }

    @Override
    public int getLegs() {
        return getLegs();
    }

    @Override
    public String toString() {
        return "Cat is walking with " + legs + " legs";
    }
}
