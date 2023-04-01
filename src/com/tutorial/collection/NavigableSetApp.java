package com.tutorial.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/*
    * NavigableSet Interface
        - NavigableSet adalah turunan dari SortedSet
        - NavigableSet menambah method-method untuk melakukan navigasi pencarian element,
            seperti mencari elemen yang lebih besar dari, kurang dari, membalikkan urutan set, dan lain-lain

 */

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>(Set.of("Erlangga", "Dewa", "Sakti"));


        Iterator<String> iterator = names.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        NavigableSet<String> namesReverse = names.descendingSet();
        for (var name : namesReverse) {
            System.out.println(name);
        }
    }
}
