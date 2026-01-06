package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Raw usage of ArrayList
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        
        // Raw usage of HashMap
        Map<Object, Object> data = new HashMap<>();
        data.put("key", "value");
        data.put(1, 100);

        printNames(names);
    }

    public static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
