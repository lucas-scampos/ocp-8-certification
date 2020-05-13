package com.certification.concurrency.review_questions;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Difference between Callable and Runnable
public class Q2 {

    public static void main(String[] args) {

        Callable<String> callable = () -> {
            return " A string";
        };

        Runnable runnable = () -> {
            System.out.println("A string");
//            return; can have return
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(callable);
        executorService.submit(runnable);
    }
}
