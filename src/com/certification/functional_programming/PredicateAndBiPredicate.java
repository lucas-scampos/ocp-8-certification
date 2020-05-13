package com.certification.functional_programming;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateAndBiPredicate {

    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));

        //
       Predicate<List> ex1 = x -> "".equals(x.get(0));
        BiPredicate <String, String> ex3 = (s1, s2) -> Boolean.TRUE;
    }
}
