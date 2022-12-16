package com.sda.cristi.advanced.encapsulation.ex1;

public class Dog {
    private String name;
    private boolean gender;
    private int age;
    private double weight;
    private String race;

    public Dog(String name, boolean gender, int age, double weight, String race) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.race = race;
    }

    public Dog(boolean gender, String race) {

        this("Dog", gender, 0, 300.0, race);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                '}';
    }
}
