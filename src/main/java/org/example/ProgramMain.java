package org.example;

import java.util.HashMap;

import static org.example.Program.*;

public class ProgramMain {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

        HashMap<String, Book> books = new HashMap<>();
        books.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        books.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(books);
        System.out.println("---");
        printValueIfNameContains(books, "prejud");
    }
}
