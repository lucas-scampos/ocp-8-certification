package com.certification.generics_and_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferences {

    public static void main(String[] args) {
        //Static methods
        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

        // Calling an instance method on a specific instance
        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = s -> str.startsWith(s);

        //we call an instance method without knowing the instance in advance:
        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

        //constructor reference, uses "new" instead of a method
        Supplier<ArrayList> methodRef4 = ArrayList::new;
        Supplier<ArrayList> lambda4 = () -> new ArrayList();
    }
}
