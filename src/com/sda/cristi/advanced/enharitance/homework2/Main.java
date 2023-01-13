package com.sda.cristi.advanced.enharitance.homework2;

/**
 * Homework
 * Create classes Dog and Cat.
 * 	a) Move common methods and fields to the class Animal.
 * 	b) Create method „yieldVoice”.
 * c) Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * d) Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 */
public class Main {
    public static void main(String[] args) {
      Animals[] animals=new Animals[2];
      animals[0]=new Animals("Misi",1,3);
      animals[1]=new Animals("Maia",4,16);
      for(Animals animale:animals){
          System.out.println(animale);
      }
    }
}
