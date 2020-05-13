package com.certification.generics_and_collections;

public class LegacyAutoboxing {
    public static void main(String[] args) {
        java.util.List numbers = new java.util.ArrayList();
        numbers.add(5); // 5 here is of type Object
       // int result = numbers.get(0); // DOES NOT COMPILE
    }
}