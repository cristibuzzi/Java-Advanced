package com.sda.cristi.advanced.generics.ex2;

import com.sda.cristi.advanced.generics.ex2.library.GenericLibrary;
import com.sda.cristi.advanced.generics.ex2.model.Book;

import java.time.LocalDate;

/**
 * Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
 * Provide one version of the class that uses generics and one that does not.
 */
public class Main {
    public static void main(String[] args) {
        GenericLibrary<Book> bookLibrary = new GenericLibrary<>();
        bookLibrary.addMedia(new Book("A", 54.25, LocalDate.now().minusDays(3), "ccc"));
        bookLibrary.addMedia(new Book("B", 33.2, LocalDate.now().minusDays(22), "aaa"));
        bookLibrary.addMedia(new Book("C", 34.4, LocalDate.now().minusDays(15), "bbb"));
        System.out.println(bookLibrary.getAllMediaWithPriceLowerThan(54));
        System.out.println(bookLibrary.getAllMediaWithRelaseDateAfter(LocalDate.now().minusDays(3)));
        System.out.println(bookLibrary.getMediaByTitle("A"));
        System.out.println(bookLibrary.getMediaByTitle("sadsad"));
        System.out.println(bookLibrary.getAllMedia());
    }
}
