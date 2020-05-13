package com.certification.generics_and_collections;

import java.util.*;

class DuckComparableFather {
    private String name;

    public DuckComparableFather(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class DuckComparableComparator extends DuckComparableFather implements Comparable<DuckComparableComparator> {


    public DuckComparableComparator(String name) {
        super(name);
    }

    public static void main(String[] args) {
        DuckComparableComparator duck1 = new DuckComparableComparator("1");
        DuckComparableComparator duckB = new DuckComparableComparator("B");
        DuckComparableComparator duckA = new DuckComparableComparator("A");

        List<DuckComparableComparator> ducks = new ArrayList<>(Arrays.asList(duckA, duck1, duckB));

        ducks.forEach(e -> printDuck(e));

//        Collections.sort(ducks);
        System.out.println(" ---");

//        ducks.forEach(e -> printDuck(e));

        Comparator<DuckComparableComparator> comparatorByName = (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        };

//        Comparator<DuckComparable> comparatorByName =
//                Comparator.comparing(e -> e.getName(), (o1, o2) -> {
//                    return o1.compareTo(o2);
//                });
        Collections.sort(ducks, comparatorByName);

        ducks.forEach(e -> printDuck(e));

    }

    private static void printDuck(DuckComparableFather duckComparable) {
        System.out.printf(duckComparable.getName() + ", ");
    }

    /*  0 = equals
        >1 = current object is smaller than the argument
        <1 = current object is GREATER than the argument
    *
    * */
    public int compareTo(DuckComparableComparator otherDuck) {
        return this.getName().compareTo(otherDuck.getName());
    }
}
