package com.certification.concurrency.review_questions;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class Q14 {

    //FIXME code does not compile because line 11,12,13, throw InterruptException
    public void addAndPrintItems(BlockingDeque<Integer> deque) {
        deque.offer(103);
//        deque.offerFirst(20, 1, TimeUnit.SECONDS);
//        deque.offerLast(85, 7, TimeUnit.HOURS);
//        System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
//        System.out.print(" " + deque.pollLast(1, TimeUnit.MINUTES));
    }
}