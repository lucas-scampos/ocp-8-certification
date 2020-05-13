package com.certification.generics_and_collections.review_questions;

import java.io.IOException;
import java.util.*;

public class Q13 {
}

class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        Wildcard card = new Wildcard();

//        ArrayDeque<?> list = new ArrayDeque<String>(); //Compiles but cant be passed to showSize because ArrayDeque != List
//        ArrayList<? super Date> list = new ArrayList<Date>(); WORKS
//        List<?> list = new ArrayList<?>(); Dont compile Option C is incorrect because the wild- card is not allowed to be on the right side of an assignment.
//        List<Exception> list = new LinkedList<IOException>(); not compatible generic types
        Vector<? extends Number> list = new Vector<Integer>();
        card.showSize(list);
    }
}