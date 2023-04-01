package com.tutorial.collection;

import java.util.PriorityQueue;
import java.util.Queue;

/*
    * Queue Interface
        - Queue is a data structure that stores elements in a FIFO (First In First Out) manner.

    * * ArrayDeque vs LinkedList vs PriorityQueue
        - ArrayDeque menggunakan array sebagai implementasi queue nya
        - LinkedList menggunakan double linked list sebagai implementasi queue nya
        - PriorityQueue menggunakan array sebagai implementasi queue nya,
            namun diurutkan mennggunakan Comparable atau Comparator

 */

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>();
        Queue<String> queue = new PriorityQueue<>();
//        Queue<String> queue = new LinkedList<>();

        queue.add("B");
        queue.add("A");
        queue.add("E");
        queue.add("D");
        queue.add("C");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }
    }
}
