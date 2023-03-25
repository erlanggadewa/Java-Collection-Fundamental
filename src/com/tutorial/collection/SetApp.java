package com.tutorial.collection;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
    * Set Interface
        - Set adalah salah satu collection yang berisikan elemen-elemen yang unik, atau tidak boleh duplicate
        - Set tidak memiliki index seperti di List, oleh karena itu tidak ada jaminan data yang ada di Set itu akan terurut sesuai dengan waktu kita memasukkan data ke Set
        - Set tidak memiliki method baru, jadi hanya menggunakan method yang ada di interface parent nya, yaitu Collection dan Iterable
        - Karena tidak memiliki index, untuk mengambil data di Set juga kita harus melakukan iterasi satu per satu

    * HashSet vs LinkedHashSet
        - Di belakang HashSet dan LinkedHashSet sebenarnya sama-sama ada hash table, dimana data disimpan dalam sebuah hash table dengan mengkalkulasi hashCode() function
        - Yang membedakan adalah, HashSet tidak menjamin data terurut sesuai dengan waktu kita menambahkan data, sedangkan LinkedHashSet menjamin data terurut sesuai dengan waktu kita menambahkan data.
        - Urutan data di LinkedHashSet bisa dijaga karena di belakang nya menggunakan double linked list

    * EnumSet
        - EnumSet adalah Set yang elemen datanya harus Enum
        - Karena data Enum itu unik, sehingga sangat cocok menggunakan Set dibandingkan List


 */

public class SetApp {
    public static void main(String[] args) {

        Set<String> names1 = new HashSet<>();
        names1.add("Erlangga");
        names1.add("Todi");
        names1.add("Carissa");
        names1.add("Erlangga");
        names1.add("Sakti");
        names1.add("Dewa");

//        * Data yang disimpan di dalam Set tidak akan double dan tidak terurut
        System.out.println("PRINT HASH SET");
        for (String name : names1) {
            System.out.println(name);
        }

        Set<String> names2 = new LinkedHashSet<>();
        names2.add("Erlangga");
        names2.add("Todi");
        names2.add("Carissa");
        names2.add("Erlangga");
        names2.add("Sakti");
        names2.add("Dewa");

//        * Data yang disimpan di dalam Set tidak akan double dan terurut karena menggunakan LinkedHashSet
        System.out.println("\nPRINT LINKED HASH SET");
        for (String name : names2) {
            System.out.println(name);
        }

        Set<Day> days = EnumSet.allOf(Day.class);

        System.out.println("\nPRINT ENUM SET");
        for (Day day : days) {
            System.out.println(day);
        }
    }

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
