package com.certification.concurrency;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {
        //1
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
        Stream<Integer> parallelStream = stream.parallel();

        //2
        Stream<Integer> parallelStream2 = Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream();
    }
}
