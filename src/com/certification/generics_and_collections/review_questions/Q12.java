package com.certification.generics_and_collections.review_questions;

import java.io.FileNotFoundException;

public class Q12 {
}

class Helper {

    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        //All these can be applied
//        Helper.printException(new FileNotFoundException("A"));
//        Helper.printException(new Exception("B"));
        Helper.<NullPointerException>printException(new NullPointerException ("D"));

    }
}