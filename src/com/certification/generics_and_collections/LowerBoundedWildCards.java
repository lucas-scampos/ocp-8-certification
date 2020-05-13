package com.certification.generics_and_collections;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* syntax: ? super type
*  List<? super Exception> l =new ArrayList<Object>();
* */
public class LowerBoundedWildCards {

    public static void main(String[] args) {
        List<? super IOException> exceptions = new ArrayList<Exception>();

//        exceptions.add(new Exception()); // DOES NOT COMPILE because could be list of IoException or Exception.
        // and Exception would not fit here
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }

    /*
     *  With a lower bound, we are telling Java that the list will be a list of String objects or a list of some objects
     *  that are a superclass of String. Either way, it is safe to add a String to that list.
     *  */
    public static void addSound(List<? super String> list) {
        // lower bound
        list.add("quack");
    }


}