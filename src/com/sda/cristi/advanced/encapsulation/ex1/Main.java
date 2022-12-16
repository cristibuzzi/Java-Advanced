package com.sda.cristi.advanced.encapsulation.ex1;

/**
 * Create class Dog.
 * a) Add private fields to the class, like name, age, gender, race, weight.
 * b) Create constructor that accepts all of the class fields.
 * c) Create additional constructor, that will accept only gender and race. It should call main constructor with default values.
 * d) Create getters and setters for age and weight.
 * e) Create object of class Dog. Verify if everything works as expected.
 * f) Add verification for all arguments passed to the setters. E.g. setWeight method should not accept values below or equal to 0.
 */
public class Main {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0]=new Dog("Tomi", true,5,23,"boxer" );
        dogs[1]=new Dog("Marcel",true,3,10,"bichon");
        dogs[2]= new Dog(true, "ciobanesc");
                for(int i =0; i<=dogs.length-1; i++) {
                    System.out.println(dogs[i]);
                }
    }
}
