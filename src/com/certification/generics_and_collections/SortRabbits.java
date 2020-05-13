package com.certification.generics_and_collections;

import java.util.*;

public class SortRabbits {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, c);
        
        //////


        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c2 = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", c2);
        System.out.println(index);
    }
}