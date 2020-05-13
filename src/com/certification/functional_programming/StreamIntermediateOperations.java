package com.certification.functional_programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {

    public static void main(String[] args) {

    }

    /* The filter() method returns a Stream with elements that match a given expression. Here is the method signature:
        Stream<T> filter(Predicate<? super T> predicate)
    *
    * */
    public static void filter() {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::print); // monkey
    }

    /*The distinct() method returns a stream with duplicate values removed. The duplicates do not need to be adjacent to be removed.
    As you might imagine, Java calls equals() to deter- mine whether the objects are the same
    *
    Stream<T> distinct()
    * */
    public static void distinct() {
        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::print); // duckgoose
    }


    /* Stream<T> limit(int maxSize)
    Stream<T> skip(int n)
    *
    * */
    public static void limitSkip() {
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(5).limit(2).forEach(System.out::print); // 67
    }

    /* The map() method creates a one-to-one mapping from the elements in the stream to the elements of the next step in the stream.
     *
     *  <R> Stream<R> map(Function<? super T, ? extends R> mapper)
     *
     * */
    public static void map() {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length).forEach(System.out::print); // 676
    }

    /* The flatMap() method takes each element in the stream and makes any elements it contains top-level elements in a single stream
     * <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
     *
     *
     * */
    public static void flatMap() {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");

        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(l -> l.stream()).forEach(System.out::println);
    }

    /*
    *  The sorted() method returns a stream with the elements sorted.
    * Just like sorting arrays, Java uses natural ordering unless we specify a
    *
    *   Stream<T> sorted()
        Stream<T> sorted(Comparator<? super T> comparator)
    * */
    public static void sorted() {
        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print); // bear-brown-

        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
        s2.sorted(Comparator.reverseOrder())
                .forEach(System.out::print); // grizzly-brown bear-
        /*
         *   s.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
         *
         * The Comparator interface implements one method that takes two String parameters and returns an int.
         * However, Comparator::reverseOrder doesn’t do that.
         * It is a reference to a function that takes zero parameters and returns a Comparator
         * */
    }

    /* It is useful for debugging because it allows us to perform a stream operation without actually changing the stream.
     *
     * Stream<T> peek(Consumer<? super T> action)
     *
     * */
    public static void peek() {
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1
    }
}
