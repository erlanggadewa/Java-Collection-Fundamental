package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
    * Collection interface
        - Selain Iterable interface, parent class semua collection di Java adalah Collection
        - Kalo Iterable interface digunakan sebagai kontrak untuk meng-iterasi data secara sequential
        - Collection merupakan kontrak untuk memanipulasi data collection,
            seperti menambah, menghapus dan mengecek isi data collection
        - Tidak ada direct implementation untuk Collection,
            karena collection nanti akan dibagi lagi menjadi List, Set dan Queue


 */
public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Erlangga");
        collection.add("Dewa");
        collection.add("Sakti");
        collection.addAll(List.of("Carissa", "Indah", "Swastika"));

        for (String names : collection) {
            System.out.println(names);
        }

        collection.remove("Carissa");
        collection.removeIf(names -> names.endsWith("a"));

        System.out.println("After remove");
        for (String names : collection) {
            System.out.println(names);
        }

        System.out.println("Size: " + collection.size());

        System.out.println("Is empty: " + collection.isEmpty());

        System.out.println("Contains Erlangga: " + collection.contains("Erlangga"));
    }
}
