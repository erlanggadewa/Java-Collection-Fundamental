package com.tutorial.collection;

import java.util.ArrayDeque;
import java.util.Deque;

/*
    * Deque is a double ended queue. It can be used as a queue or stack.
        - Deque singkatan dari double ended queue, artinya queue yang bisa beroperasi dari depan atau belakang
        - Jika pada queue, operasi yang didukung ada FIFO, namu pada deque, tidak hanya FIFO,
         namun juga mendukung LIFO (Last In First Out)
        - Bisa dibilang deque adalah implementasi struktur data antrian dan stack (tumpukan)

 */

public class DequeApp {
    public static void main(String[] args) {
//        Deque<String> deque = new LinkedList<>();
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("E");
        deque.offerLast("C");
        deque.offerLast("A");
        deque.offerFirst("D");
        deque.offerFirst("B");

        for (String val = deque.pollLast(); val != null; val = deque.pollLast()) {
            System.out.println(val);
        }
    }
}
