package com.certification.generics_and_collections.review_questions;

public class Q6 {
}

class Hello<T> {
    T t;

    public Hello(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        System.out.print(new Hello("there"));
        //returns hithere
    }
}
