package com.certification.concurrency.review_questions;

import java.util.concurrent.Callable;

public class Q15 {

    // valid callable expressions
    public static void main(String[] args) {
        Callable c1 = () -> 5;
        Callable c2 = () -> "The" + "Zoo";
        Callable c3 = () -> {
            System.out.println("Giraffe");
            return 10;
        };

    }
}
