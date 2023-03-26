package com.tutorial.collection;

import com.tutorial.collection.data.Person;
import com.tutorial.collection.data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

/*
    * SortedSet
        - SortedSet adalah turunan dari Set, namun di SortedSet elemen-elemen yang dimasukkan kedalam SortedSet akan otomatis diurutkan
        - Jika element adalah turunan dari interface Comparable, maka secara otomatis akan diurutkan menggunakan comparable tersebut
        - Jika element bukan turunan dari interface Comparable,
           maka kita bisa menggunakan Comparator untuk memberi tahun si SortedSet bagaimana cara mengurutkan elemen-elemen nya

 */

public class SortedSetApp {
    public static void main(String[] args) {
/*
    Kita wajib memasukan sebuah comparator di dalam constructor TreeSet,
    jika class yang kita gunakan belum memiliki implementasi dari comparable
 */
        SortedSet<Person> persons = new TreeSet<>(new PersonComparator().reversed());

        persons.add(new Person("Erlangga"));
        persons.add(new Person("Dewa"));
        persons.add(new Person("Sakti"));

        for (Person person : persons) {
            System.out.println(person.getName());
        }

        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(8);
        numbers.add(12);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
