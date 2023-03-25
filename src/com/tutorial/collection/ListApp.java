package com.tutorial.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/*
    * List Interface
        - List adalah struktur data collection yang memiliki sifat sebagai berikut
            1. Elemen  di list bisa duplikat, artinya bisa memasukkan data yang sama
            2. Data list berurut sesuai dengan posisi kita memasukkan data
            3. List memiliki index, sehingga kita bisa menggunakan nomor index untuk mendapatkan element di list
        - Di Java ada beberapa implementasi List, dan kita bisa memilih sesuai dengan kebutuhan kita

    * ArrayList
        - adalah implementasi dari List menggunakan array
        - Default kapasitas array di ArrayList adalah 10
        - Namun ketika kita memasukkan data dan array sudah penuh,
            maka secara otomatis ArrayList akan membuat array baru
            dengan kapasitas baru dengan ukuran kapasitas lama + data baru
    * LinkedList
        - adalah implementasi List dengan struktur data Double Linked List
        - Terdiri dari node yang menyimpan data dan pointer ke node sebelumnya dan node selanjutnya


 */

public class ListApp {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();


        System.out.println("\nARRAY LIST IMPLEMENTATION");

        arrayList.add("Erlangga");
        arrayList.add("Dewa");

        System.out.println(arrayList.remove("Erlangga"));
        System.out.println(arrayList.remove(0));

        arrayList.addAll(List.of("Carissa", "Indah", "Swastika"));

        System.out.println("Print array list names");
        for (String names : arrayList) {
            System.out.println(names);
        }

        System.out.println("\nLINKED LIST IMPLEMENTATION");

        linkedList.add("Erlangga");
        linkedList.add("Dewa");

        System.out.println(linkedList.remove("Erlangga"));
        System.out.println(linkedList.remove(0));

        linkedList.addAll(List.of("Carissa", "Indah", "Swastika"));

        System.out.println("Print array list names");
        for (String names : linkedList) {
            System.out.println(names);
        }

    }
}
