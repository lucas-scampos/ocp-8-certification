package com.certification.functional_programming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/*
 *  A Supplier is used when you want to generate or supply values without taking any input.
 * */
public class Suppplier {

    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1); System.out.println(d2);

        Supplier<ArrayList<String>> a1 = ArrayList<String>::new;
        ArrayList<String> b2 = a1.get();
        System.out.println(b2);
    }
}
