package com.sda.cristi.advanced.collections.map.ex1;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a map and display its result (data should be provided by the user - console):
 * - Names and surnames
 * - Names and ages. //homework
 */

public class Main {
    public static void main(String[] args) {
        Map<String, String> surnamesByNames = new HashMap<>();
        surnamesByNames.put("Vasile", "Grigore");
        surnamesByNames.put("Vasile", "Ion");
        surnamesByNames.put("Vasile2", "Dumitru");
        surnamesByNames.put("Ion", "Igor");
        surnamesByNames.put("Anton", "Igor");
        for (Map.Entry<String, String> entry : surnamesByNames.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        if(!surnamesByNames.containsKey("Vasile")) {
            surnamesByNames.put("Vasile" , "Igor" );
        }
        surnamesByNames.putIfAbsent("Vasile" , "Cristi"); // same thing as if above



        System.out.println();
        System.out.println();
        System.out.println(surnamesByNames.get("Vasile"));
        System.out.println(surnamesByNames.get("Vasile365"));
        System.out.println(surnamesByNames.get("Ion"));

    }
}
