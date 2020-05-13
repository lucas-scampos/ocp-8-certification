package com.certification.functional_programming;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResults {


    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(","));
        System.out.println(result);

        Double resultDouble = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(resultDouble);

        TreeSet<String> result3 = ohMy.filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result);
    }

    private static void collectingIntoMaps() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}
    }

    private static void collectingIntoGroups() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }

    // partitioning is a specifial type of group that is TRUE or false
    private static void partitioning(){
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map); // {false=[tigers], true=[lions, bears]}
    }
}




