package com.sda.cristi.advanced.abstractclass.Homework2;

public class Fish extends Animal {
    public Fish(int legs) {
        super(legs);
    }

    @Override
    public int getLegs() {
        return super.getLegs();
    }

    @Override
    public String walk() {
        return null;
    }

    @Override
    public String toString() {
        return "Fish is walking with " + legs +" legs, because he doesn't have legs, he has swimmers";
    }
}
