package com.certification.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * synchronizedCollection(Collection<T> c)
 * synchronizedList(List<T> list)
 * synchronizedMap(Map<K,V> m)
 * synchronizedNavigableMap(NavigableMap<K,V> m)
 * synchronizedNavigableSet(NavigableSet<T> s)
 * synchronizedSet(Set<T> s)
 * synchronizedSortedMap(SortedMap<K,V> m)
 * synchronizedSortedSet(SortedSet<T> s)
 *
 * */
public class ObtainingSyncCollections {

    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));
        synchronized (list) {
            for (int data : list)
                System.out.print(data + " ");
        }

    }
}
