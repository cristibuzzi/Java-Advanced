package com.sda.cristi.advanced.abstractclass.Homework2;

/**
 *##### Abstract class exercise 3
 *
 * Create the abstract class Animal that will encapsulate the fallowing data:
 * - legs
 * - one constructor that will accept the number of legs as parameters
 * - one abstract method walk()
 *
 * Next, create the fallowing concrete classes that will inherit from class Animal:
 * - Spider
 *   - the walk method should print "Sprider is walking with X legs", where X is the number of legs
 * - Cat
 *   - the walk method should print "Cat is walking with X legs", where X is the number of legs
 * - Fish
 *   - the walk method should print "Fish is walking with X legs", where X is the number of legs
 */

public class Main {
    public static void main(String[] args) {
        Animal spider1=new Spider(8);
        System.out.println(spider1);
        Animal cat1=new Cat(4);
        System.out.println(cat1);
        Animal fish1=new Fish(0);
        System.out.println(fish1);

    }
}
