package com.certification.concurrency.review_questions;

import java.util.concurrent.*;

public class Q3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService service = Executors.newSingleThreadScheduledExecutor();
//
////        service.scheduleWithFixedDelay(() -> { // w1 FIXME DOES NOT COMPILE because service doesnt have scheduleWithFixedDelay
////            System.out.println("Open Zoo");          FIXME scheduleWithFixed also it only supports Runnable
////            return null; // w2
////        }, 0, 1, TimeUnit.MINUTES);
//        Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
//         System.out.println(result.get()); // w4 FIXME DOES NOT COMPILE because service doesnt have scheduleWithFixedDelay


        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
            System.out.println(" Open zoo");
        }, 0, 1, TimeUnit.MINUTES);
        Future<?> result = scheduledExecutorService.submit(() -> System.out.println("Wake Staff")); // w3
        System.out.println(result.get());

    }
}
