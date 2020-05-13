package com.certification.functional_programming;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SummarizingStatistics {

    public static void main(String[] args) {
        System.out.println(max(IntStream.range(1, 4)));
    }

    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }

    //We use statistics so we can use get count, max, min without terminating the stream
    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }
}
