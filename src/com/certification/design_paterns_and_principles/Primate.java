package com.certification.design_paterns_and_principles;
/* 1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
*  2. Casting an object from a superclass to a subclass requires an explicit cast.
*  3. The compiler will not allow casts to unrelated types.
* */
public class Primate {

    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    public int age = 10;

    public boolean isTailStriped() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();

        Primate primate = lemur;
        Primate primateReal = new Primate();

        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Lemur lemur2 = (Lemur) primate; // primate instance is of type Lemur
//        Lemur lemur3 = (Lemur) primateReal; //(ClassCastException) because the instance is of type Primate

        Primate primate1 = new Lemur();
        Primate primate2 = new Primate();
        Lemur lemur1 = (Lemur) primate1;
        Lemur lemur3 = (Lemur) primate2; // Classcast

    }
}