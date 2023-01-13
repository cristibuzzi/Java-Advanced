package com.sda.cristi.advanced.javaIO.ex1;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * ##### IO Exercise 1
 * Create a file with a „lorem ipsum" paragraph within – it can be done by copy-pasting existing paragraph or generating it dynamically using Java library.
 * - Read that file.
 * - Count words.
 * - *Count special signs (like comma, dot, spaces).
 * - *Select one word and print it's number of occurrences
 */

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Cristi\\SDA\\Laborator\\SDA_Advanced_features_2.0\\files\\fileEx1.txt");

        Map<String, Integer> occurencesOfWords = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                for (String word : line.split(" ")) {
                    if (!occurencesOfWords.containsKey(word)) {
                        occurencesOfWords.put(word, 1);
                    } else {
                        int value = occurencesOfWords.get(word);
                        occurencesOfWords.put(word, value + 1);
                    }
                }
            }
        }
        System.out.println(occurencesOfWords);
        System.out.println(occurencesOfWords.get("accident")!=null ? occurencesOfWords.get("accident") : 0);
    }
}
