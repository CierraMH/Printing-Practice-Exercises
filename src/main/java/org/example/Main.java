package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("matthew", "matt");
        names.put("michael", "mix");
        names.put("arthur", "artie");

        System.out.println(names.get("matthew"));
    }
}