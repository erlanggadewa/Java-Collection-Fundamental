package com.tutorial.collection;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("one");
        Set<String> mutable = new LinkedHashSet<>();
        mutable.add("Erlangga");
        mutable.add("Dewa");
        mutable.add("Sakti");

        Set<String> immutable = Collections.unmodifiableSet(mutable);
//        immutable.add("Erlangga"); // Error, karena imutable tidak bisa diubah lagi

        Set<String> immutable2 = Set.of("Erlangga", "Dewa", "Sakti");
//        immutable2.add("Erlangga"); // Error, karena imutable tidak bisa diubah lagi
    }
}
