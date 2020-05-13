package com.certification.generics_and_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class CountIfPresentAbsent {


    public static void main(String[] args) {
        //computeIfPresent calls a bifunction if the requested key is found

        Map<String, Integer> counts = new HashMap<>();
        counts.put("jenny", 1);

        BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;

        Integer jenny = counts.computeIfPresent("jenny", mapper);
        Integer sam = counts.computeIfPresent("sam", mapper);
        System.out.println(counts);
        System.out.println(jenny);
        System.out.println(sam);


        Map<String, Integer> counts2 = new HashMap<>();
        counts2.put("Jenny", 15);
        counts2.put("Tom", null);
        Function<String, Integer> mapper2 = (k) -> 1;
        Integer jenny2 = counts.computeIfAbsent("Jenny", mapper2); // 15
        Integer sam2 = counts.computeIfAbsent("Sam", mapper2); // 1
        Integer tom2 = counts.computeIfAbsent("Tom", mapper2); // 1
        System.out.println(counts2); // {Tom=1, Jenny=15, Sam=1}

        //If the mapping function is called and returns null, the key is removed from the map for computeIfPresent().
        // For computeIfAbsent(), the key is never added to the map in the first place, for example:

        Map<String, Integer> counts3 = new HashMap<>();
        counts3.put("Jenny", 1);
        counts3.computeIfPresent("Jenny", (k, v) -> null);
        counts3.computeIfAbsent("Sam", k -> null);
        System.out.println(counts3); // {}
    }
}
