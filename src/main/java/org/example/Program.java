package org.example;

import java.util.HashMap;
import org.example.ProgramMain;

public class Program {
    //    private HashMap<String, String> program;
//    public Program() {
//        this.program = new HashMap<>();
//    }
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book value : hashmap.values()) {
            System.out.println(value);
        }
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (Book value : hashmap.values()) {
            if (value.getName().contains(text)) {
                System.out.println(value);
            }
        }
    }
}
