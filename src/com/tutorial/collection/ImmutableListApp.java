package com.tutorial.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Immutable List
    - Secara default, List di Java baik itu ArrayList ataupun LinkedList datanya bersifat mutable (Bisa diubah)
    - Di Java mendukung pembuatan Immutable List, artinya datanya tidak bisa diubah lagi.
    - Sekali List dibuat, datanya tidak bisa diubah lagi, alias final.
    - Tapi ingat, data list nya yang tidak bisa diubah, bukan reference object element nya.
        Kalo misal kita membuat Immutable List berisikan data Person, field data Person tetap bisa diubah,
        tapi isi elemen dari Immutable List tidak bisa diubah lagi
    - Ini cocok ketika kasus-kasus misal, tidak sembarangan code yang boleh mengubah element di List

 */
public class ImmutableListApp {
    public static void main(String[] args) {
        List<String> emptyList = Collections.emptyList();
        List<String> oneList = Collections.singletonList("one");
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Erlangga");
        mutableList.add("Dewa");
        mutableList.add("Sakti");


        List<String> immutableList = Collections.unmodifiableList(mutableList);
        // immutableList.add("Erlangga"); // Error, karena immutableList tidak bisa diubah lagi

        List<String> immutableList2 = List.of("Erlangga", "Dewa", "Sakti");
        // immutableList2.add("Erlangga"); // Error, karena immutableList tidak bisa diubah lagi
    }
}
