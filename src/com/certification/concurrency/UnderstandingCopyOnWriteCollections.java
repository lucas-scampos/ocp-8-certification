package com.certification.concurrency;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* These classes copy all of their elements to a new underlying structure anytime an element is added, modified,
or removed from the collection. By a modified element, we mean that the reference in the collection is changed.
 Modifying the actual contents of the collection will not cause a new structure to be allocated.
*
* */
public class UnderstandingCopyOnWriteCollections {

    public static void main(String[] args) {

        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
        for (Integer item : list) {
            System.out.print(item + " ");
            list.add(9);
        }
        System.out.println();
        System.out.println("Size: " + list.size());
    }
}
