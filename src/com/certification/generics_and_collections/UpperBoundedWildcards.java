package com.certification.generics_and_collections;

import java.util.ArrayList;
import java.util.List;

/*  Syntax: ? extends type
 *   List<? extends Exception> l =new ArrayList<RuntimeException>();
 *  Upper bounded list are immutable
 * */
public class UpperBoundedWildcards {


    static class Sparrow extends Bird {
    }

    static class Bird {
    }

    public static void main(String[] args) {
//        ArrayList<Number> list = new ArrayList<Integer>(); // DOES NOT COMPILE

        List<? extends Bird> birds = new ArrayList<Bird>(); // Java does not know what the type really is
        // birds.add(new Sparrow()); //DOES NOT COMPILE
        // birds.add(new Bird()); // DOES NOT COMPILE

        List<? extends Flyer> flyers = new ArrayList<>();
//        flyers.add(new HangGlider()); //does not compile
//        flyers.add(new Goose()); //does not compile

//        anyFlyer(flyers); does not compile
        groupOfFlyers(flyers);

        List<Flyer> flyers2 = new ArrayList<>();
        flyers2.add(new HangGlider());
        flyers2.add(new Goose());

        anyFlyer(flyers2);
        groupOfFlyers(flyers2);

        List<Goose> gooseList = new ArrayList<>();
//        anyFlyer(gooseList); does not compile
        groupOfFlyers(gooseList);

    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list)
            count += number.longValue();
        return count;
    }

    private static void anyFlyer(List<Flyer> flyer) {
    }

    private static void groupOfFlyers(List<? extends Flyer> flyer) { //Use extends rather than implements
    }
}

interface Flyer {
    void fly();
}

class HangGlider implements Flyer {
    public void fly() {
    }
}

class Goose implements Flyer {
    public void fly() {
    }
}


