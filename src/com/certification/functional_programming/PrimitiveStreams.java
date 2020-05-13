package com.certification.functional_programming;

import java.util.OptionalDouble;
import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*  IntStream: Used for the primitive types int, short, byte, and char
    LongStream: Used for the primitive type long
    DoubleStream: Used for the primitive types double and float
*
* */
public class PrimitiveStreams {

    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1, 2, 3);
//        System.out.println(stream.reduce(0, (s, n) -> s + n));
//
//        //can write the same thing as
//        Stream<Integer> stream2 = Stream.of(1, 2, 3);
//        System.out.println(stream2.mapToInt(x -> x).sum());
//
//        teste();
//
//        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
//        count.forEach(System.out::println);

        IntStream range = IntStream.range(1, 6); //1,2,3,4,5
        range.forEach(System.out::println);

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println); //1,2,3,4,5

        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum); // 15

        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min(); // runs infinitely
    }

    public static void teste() {
        Stream<String> steam = Stream.of("ab", "abc", "a");
        ToDoubleFunction<String> toDoubleFunction = a -> a.length();
        DoubleStream doubleStream = steam.mapToDouble(toDoubleFunction);
//        System.out.println(doubleStream.max());
        doubleStream.forEach(e -> System.out.println(e));
    }

}
