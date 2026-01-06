package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Processor {
    public void processItems() {
        List items = new ArrayList();
        items.add("Item A");
        items.add("Item B");

        // Raw usage of Iterator
        Iterator it = items.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
    
    public List<Integer> getNumbers() {
        // Assigning raw to parameterized
        List rawList = new ArrayList();
        rawList.add(1);
        return rawList; 
    }
}
