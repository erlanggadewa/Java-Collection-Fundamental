package com.tutorial.collection;

import com.tutorial.collection.data.Person;
import com.tutorial.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImmutableSortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> persons = new TreeSet<>(new PersonComparator().reversed());

        persons.add(new Person("Erlangga"));
        persons.add(new Person("Dewa"));
        persons.add(new Person("Sakti"));

        for (Person person : persons) {
            System.out.println(person.getName());
        }

        SortedSet<Person> immutablePersons = Collections.unmodifiableSortedSet(persons);
        immutablePersons.add(new Person("Erlangga")); // Error, karena imutable tidak bisa diubah lagi
    }
}
