package com.sda.cristi.advanced.composition.ex1;

/**
 * Write a Java class Author with following features:
 * 	Instance variables :
 * firstName for the author’s first name of type String.
 * lastName for the author’s last name of type String.
 * 	Constructor:
 * A constructor with parameters, it creates the Author object by setting the two fields to the passed values.
 * 	Instance methods:
 * Getters and setters for variables
 * toString(): This method printed out author’s name to the screen
 * Write a Java class Book with following features:
 * 	Instance variables :
 * title for the title of book of type String.
 * author for the author’s name of type String.
 * price for the book price of type double.
 * 	Constructor:
 * A constructor with parameters, it creates the Author object by setting the the fields to the passed values.
 * 	Instance methods:
 * Getters and setters for variables
 * toString(): This method printed out book’s details to the screen
 * Write a separate class BookDemo with a main() method creates a Book titled “Developing Java Software” with authors Russel Winderand price 79.75. Prints the Book’s string representation to standard output (using System.out.println)
 */
public class Main {
    public static void main(String[] args) {
        Author mihaiEminescu= new Author("Mihai" , "Eminescu");
        Author mirceaEliade= new Author("Mircea", "Eliade");

        Book book1=new Book("Title1", mihaiEminescu,22.5 );
        Book book2=new Book("Title2", mihaiEminescu, 30.5);
        Book book3=new Book("Title3", mirceaEliade, 55.5);
        System.out.println(book3);
        System.out.println(book1);
        System.out.println(book2);
    }



}
