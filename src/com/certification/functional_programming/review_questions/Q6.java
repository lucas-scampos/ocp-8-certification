package com.certification.functional_programming.review_questions;

import java.util.stream.Stream;

/*
* Which of the following can fill in the blank so that the code prints out false? (Choose all that apply.)
* */
public class Q6 {
    public static void main(String[] args) {
        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.allMatch((String::isEmpty));
        System.out.println(match);
    }
}
