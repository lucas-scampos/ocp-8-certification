package com.certification.concurrency.review_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q7 {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = new CopyOnWriteArrayList<>(l1); // designed to preserve the original list on iteration
        Set<Integer> s3 = new ConcurrentSkipListSet<>();
        s3.addAll(l1);

        for (Integer item : l2) {
            l2.add(4); // x1
        }
        for (Integer item : s3) {
            s3.add(5); // x2
        }
        System.out.println(l1.size() + " " + l2.size() + " " + s3.size());

        //l1 : 1,2,3
        // l2: 1,2,3,4,4,4
        //l3: 1,2,3,
    }
}
