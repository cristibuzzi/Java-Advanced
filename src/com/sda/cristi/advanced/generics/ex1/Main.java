package com.sda.cristi.advanced.generics.ex1;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *Create a Person class that will implement a Comparable interface.
 * Person class should implement compareTo method, that will verify if one person is taller than another.
 */
public class Main {
    public static void main(String[] args) {


        Person Cristi = new Person("Cristi", LocalDate.now(), 187);
        Person Alexandru = new Person("Alexandru", LocalDate.now(), 170);
        Person Claudia = new Person("Claudia", LocalDate.now(), 165);

        System.out.println(Cristi.compareTo(Alexandru));
        System.out.println(Claudia.compareTo(Claudia));

        List<Person> persons= new ArrayList<>();
        persons.add(Cristi);
        persons.add(Claudia);
        persons.add(Alexandru);

        Collections.sort(persons);
        System.out.println(persons);
    }
}