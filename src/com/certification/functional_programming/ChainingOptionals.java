package com.certification.functional_programming;

import java.util.Optional;

public class ChainingOptionals {

    public static void main(String[] args) {
    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3)
                System.out.println(string);
        }
    }

    //A functional approach to the above code would be
    private static void threeDigitModified(Optional<Integer> optional) {
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }

    private static Optional<Integer> calculator(String s) {
        return Optional.of(s.length());
    }

    private static void test(Optional<String> optional) {
        Optional<Integer> opt = optional.map(String::length);
//        Optional<Integer> optOfOpt = optional.map( e-> calculator(e)); does not compile
        Optional<Integer> optOfOpt = optional.flatMap(e -> calculator(e));
    }
}
