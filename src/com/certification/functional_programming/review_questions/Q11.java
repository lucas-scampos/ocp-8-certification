package com.certification.functional_programming.review_questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q11 {
    public static void main(String[] args) {
        //Change map (x -> x)tomap(x -> "" + x).
        System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x ->" " + x).collect(Collectors. joining()));
    }
}
