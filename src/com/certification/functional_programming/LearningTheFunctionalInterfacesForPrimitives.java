package com.certification.functional_programming;

import java.util.function.BooleanSupplier;

public class LearningTheFunctionalInterfacesForPrimitives {

    public static void main(String[] args) {

    }

    /*
     *  boolean getAsBoolean()
     * */
    public static void functionalInterfacesForBoolean() {
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());
    }
}