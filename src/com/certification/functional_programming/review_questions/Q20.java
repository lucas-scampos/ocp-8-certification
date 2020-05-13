package com.certification.functional_programming.review_questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q20 {

    public static void main(String[] args) {
        List<Integer> l = IntStream.range(1, 6) .mapToObj(i -> i).collect(Collectors.toList());
        l.forEach(System.out::println);

        //What is the simplest way of rewriting this?

        IntStream.range(1, 6)
                .forEach(System.out::println);
    }
}
