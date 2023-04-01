package com.tutorial.map;

import java.util.HashMap;
import java.util.Map;

/*
    * HashMap adalah implementasi dari Map interface.
        - HashMap adalah implementasi Map yang melakukan distribusi key menggunakan hashCode() function
        - Karena HashMap sangat bergantung dengan hashCode() function,
            jadi pastikan kita harus membuat function hashCode seunik mungkin, karena jika terlalu banyak nilai hashCode() yang sama,
            maka pendistribusian key nya tidak akan optimal sehingga proses get data di Map akan semakin lambat
        - Di HashMap pengecekan data duplikat dilakukan dengan menggunakan method equals nya

 */

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Erlangga Dewa Sakti");
        map.put("region", "Indonesia");
        map.put("age", "22");

        System.out.println(map.get("name"));
        System.out.println(map.get("region"));
        System.out.println(map.get("age"));
    }
}
