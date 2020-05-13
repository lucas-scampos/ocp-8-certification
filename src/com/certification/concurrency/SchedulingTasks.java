package com.certification.concurrency;


import java.util.concurrent.*;

/* schedule(Callable<V> callable, long delay, TimeUnit unit)
 * schedule(Runnable command, long delay, TimeUnit unit)
 * scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)
 * scheduleAtFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)
 * */
public class SchedulingTasks {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";
        Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(task2, 8, TimeUnit.MINUTES);
    }
}
