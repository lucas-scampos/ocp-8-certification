package com.certification.functional_programming.review_questions;

import java.util.stream.Stream;

/*
*
1. What is the output of the following?
* * */
public class Q1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2")); //map is an intermediate operation
    }
}
