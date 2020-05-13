package com.certification.generics_and_collections.review_questions;

import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        // HashSet<Number> hs = new HashSet<Integer>(); does not compile
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        List<String> list = new Vector<String>(); //vector implements list
        //List<Object> values = new HashSet<Object>(); does not compile
        //List<Object> objects = new ArrayList<? extends Object>(); does not compile <? extends Object>() fails
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
