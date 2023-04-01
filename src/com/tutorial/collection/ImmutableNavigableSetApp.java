package com.tutorial.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ImmutableNavigableSetApp {
    public static void main(String[] args) {
        // TODO code application logic here

        NavigableSet<String> names = new TreeSet<>();
        names.add("Erlangga");
        names.add("Dewa");
        names.add("Sakti");
        names.add("Carissa");
        names.add("Indah");
        names.add("Swastika");

        System.out.println("---Names---");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("---Names2---");
        NavigableSet<String> names2 = names.headSet("Erlangga", true);
        for (String name : names2) {
            System.out.println(name);
        }

        NavigableSet<String> immutableNames = Collections.unmodifiableNavigableSet(names);
//        immutableNames.add("Budi"); // error
    }
}
