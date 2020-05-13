package com.certification.functional_programming;


import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * You can perform a terminal operation without any intermediate operations but not the other way around.
 * */
public class StreamTerminalOperations {

    public static void main(String[] args) {
        collect();
    }

    /* long count()
     * */
    public static void countMethod() {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3
    }

    /*
     * The min() and max() methods allow you to pass a custom comparator and find the smallest
     * or largest value in a finite stream according to that sort order.
     *
     * Optional<T> min(<? super T> comparator)
     * Optional<T> max(<? super T> comparator)
     * */
    public static void minMax() {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape
    }

    /*
     * The findAny() and findFirst() methods return an element of the stream unless the stream is empty.
     * If the stream is empty, they return an empty Optional.
     *
     * Optional<T> findAny()
     *  Optional<T> findFirst()
     * */
    public static void FindAnyFindFirst() {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp
    }

    /*
     * The allMatch(), anyMatch() and noneMatch() methods search a stream and return information about
     *  how the stream pertains to the predicate
     * boolean anyMatch(Predicate <? super T> predicate)
     * boolean allMatch(Predicate <? super T> predicate)
     * boolean noneMatch(Predicate <? super T> predicate)
     * */
    public static void allMatchAnyMatchNoneMatch() {
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred)); // true
    }

    /*
     *  void forEach(Consumer<? super T> action)
     * */
    public static void forEach() {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo
    }

    /*  T reduce(T identity, BinaryOperator<T> accumulator)
        Optional<T> reduce(BinaryOperator<T> accumulator)
        <U> U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
    * */
    public static void reduce() {
        String[] array = new String[]{"w", "o", "l", "f"};
        String result = ""; //identity
        for (String s : array) result = result + s;
        System.out.println(result);

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf

        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        System.out.println(stream2.reduce(1, (a, b) -> a*b));
    }

    /*  <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
        <R,A> R collect(Collector<? super T, A,R> collector)
    *
       mutable reduction
    * */
    public static void collect(){
        Stream<String> stream = Stream.of("w", "o", "l", "f");

        BiConsumer<String, String> acumulador = (a,b) -> System.out.println() ;
        BiConsumer<String, String> combinador = (a,b) -> System.out.println() ;

         /*The first parameter is a Supplier that creates the object that will store the results as we collect data.
         Remember that a Supplier doesn’t take any parameters and returns a value. In this case, it constructs a new StringBuilder.

        The second parameter is a BiConsumer, which takes two parameters and doesn’t return anything.
        It is responsible for adding one more element to the data collection. In this exam- ple, it appends the next String to the StringBuilder.

        The final parameter is another BiConsumer. It is responsible for taking two data collec- tions and merging them.
         This is useful when we are processing in parallel. Two smaller collections are formed and then merged into one

        * */

        StringBuilder wolf = stream.collect(()-> new StringBuilder(), (a,b) -> a.append(b), (a,b) -> a.append(b) );
        System.out.println(wolf);

        Stream<String> stream2 = Stream.of("w","h","a","t");
        List<String> listadoida = stream2.collect(() -> new ArrayList<>(), (a,b) -> a.add(b), (a,b) -> a.addAll(b));
        Consumer<String> printaPlease = (a) -> System.out.println(a);
        listadoida.forEach(printaPlease);

        ///
        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream3.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set);

        Stream<String> stream3_1 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set_2 = stream.collect(Collectors.toCollection(TreeSet::new)); System.out.println(set); //

        /*If we didn’t need the set to be sorted, we could make the code even shorter:
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set); // [f, w, l, o]*/
    }
}
