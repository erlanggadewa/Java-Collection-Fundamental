package com.tutorial.map;

import java.util.IdentityHashMap;
import java.util.Map;

/*
    * IdentityHashMap
        - IdentittyHashMap adalah implementasi Map sama seperti HashMap
        - Yang membedakan adalah cara pengecekan kesamaan datanya, tidak menggunakan function equals,
            melainkan menggunakan operator == (reference equality)
        - Artinya data dianggap sama, jika memang lokasi di memory tersebut sama

 */

public class IdentityHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name";
        String key2 = ".";
        String key3 = "first";
        String key4 = key1 + key2 + key3;

        map.put(key4, "Erlangga1");

        String key5 = "name.first";
        map.put(key5, "Erlangga2");

        // * Data duplikat walaupun key nya sama, tetapi karena menggunakan operator == (reference equality) maka data tidak akan dianggap duplikat
        System.out.println(map.get(key4));
        System.out.println(map.get(key5));

        System.out.println(key4.equals(key5));
        System.out.println(key4 == key5);
    }
}
