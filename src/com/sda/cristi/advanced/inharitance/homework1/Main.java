package com.sda.cristi.advanced.inharitance.homework1;

/**
 * Create a class called Employee whose objects are records for an employee.
 * This class will be a derived class of the class Person which you will have
 * to copy into a file of your own and compile. An employee record has an employee's name
 * (inherited from the class Person), an annual salary represented as a single value of type double,
 * a year the employee started work as a single value of type int and a national insurance number, which is a value of type String.
 * 	Your class should have a reasonable number of constructors and accessor methods,
 * 	as well as an equals method. Write another class containing a main method to fully test your class definition.
 */
public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Cristi", 10, 2022, "insurance1");
        Person person2 = new Person("Alex", 11, 2022, "insurance123");
        Person person3 = new Person("Claudia", 12, 2021, "insurance12");
        System.out.println(person3);
        System.out.println(person2);
        System.out.println(person1);
}
    }

