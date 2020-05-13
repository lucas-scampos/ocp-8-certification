package com.certification.generics_and_collections.review_questions;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add(7);
        //for (String s : list)  DOES NOT COMPILE
          //  System.out.print(s);
    }
}
