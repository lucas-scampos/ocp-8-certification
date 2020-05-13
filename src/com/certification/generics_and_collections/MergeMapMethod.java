package com.certification.generics_and_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

//The merge() method allows adding logic to the problem of what to choose
public class MergeMapMethod {

    public static void main(String[] args) {

        BiFunction<String, String, String> mapper = (v1, v2)
                -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");
        favorites.put("nullValue", null);

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);
        String nullValue = favorites.merge("nullValue", "Skyride", mapper); // mapping function isnt called, skyride is added

        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour,nullValue=Skyride}
        System.out.println(jenny); // Bus Tour
        System.out.println(tom); // Skyride

        ////////

        BiFunction<String, String, String> mapperNull = (v1, v2) -> null;
        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Jenny", "Bus Tour");
        favorites2.put("Tom", "Bus Tour");
        favorites2.merge("Jenny", "Skyride", mapperNull); //jenny is removed from the map
        favorites2.merge("Sam", "Skyride", mapperNull); //skyride is added because mapperNull is not executed

        System.out.println(favorites2); // {Tom=Bus Tour, Sam=Skyride}
    }
}
