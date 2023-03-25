package com.tutorial.collection;

import java.util.Iterator;
import java.util.List;

/*
 * Iterable interface
    - Iterable adalah parent untuk semua collection di Java, kecuali Map
    - Iterable sendiri sangat sederhana, hanya digunakan agar mendukung for-each loop
    - Karena semua collection pasti implement iterable,
        secara otomatis maka semua collection di Java mendukung perulangan for-each, jadi bukan cuma Array

 */

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Erlangga", "Dewa", "Sakti");
        Iterator<String> iterator = names.iterator();

        // * Before Java 5 , we use iterator to iterate collection
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // * After Java 5, we can use for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
