package com.certification.generics_and_collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrrayDeque {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10));
        System.out.println(queue.offer(4));
        // queue = [10,4]

        System.out.println(queue.peek()); //10
        System.out.println(queue.poll()); //10
        System.out.println(queue.poll()); //4
        System.out.println(queue.peek()); //null

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        stack.push(5);
        //stack = [5,4,10]
        System.out.println(stack.peek());
        System.out.println(stack.peekFirst());
        System.out.println(stack.peekLast());
        System.out.println(stack.poll()); //[4,10]
        System.out.println(stack.pop()); //10
        //Pop and poll do the same, but pop throws exception if queue is empty
    }
}
