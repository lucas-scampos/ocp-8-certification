package com.certification.concurrency.review_questions;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class Q12 {
}

class CountNumbers extends RecursiveAction {
    private int start;
    private int end;

    public CountNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        if (start < 0) return; //FIXME THIS CONDITION WILL NEVER BE REACHEDA ND WILL BE HANG FOREVER
        else {
            int middle = start + ((end - start) / 2);
            invokeAll(new CountNumbers(start, middle), new CountNumbers(middle, end)); // m1
        }
    }

    public static void main(String[] args) {
        ForkJoinTask<?> task = new CountNumbers(0, 4); // m2
        ForkJoinPool pool = new ForkJoinPool();
        Object result = pool.invoke(task); // m3
    }
}
