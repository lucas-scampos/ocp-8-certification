package com.certification.generics_and_collections.review_questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q19 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1); //By object and not by index
        System.out.print(q);
    }
}
