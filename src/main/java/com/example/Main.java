package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Raw usage of ArrayList
        List names = new ArrayList();
        names.add("Alice");
        names.add("Bob");
        
        // Raw usage of HashMap
        Map data = new HashMap();
        data.put("key", "value");
        data.put(1, 100);

        // Raw usage of HashSet
        Set uniqueItems = new HashSet();
        uniqueItems.add(10);
        uniqueItems.add("string");

        // Raw usage of Comparable
        Comparable comp = "test";
        comp.compareTo(10);

        printNames(names);
        
        // Passing raw list to parameterized method
        processStrings(names);
    }

    public static void printNames(List names) {
        for (Object name : names) {
            System.out.println(name);
        }
    }

    public static void processStrings(List<String> strings) {
        for (String s : strings) {
            System.out.println(s.toUpperCase());
        }
    }
}
