package com.trl.theoreticalKnowledge.collections.list.arrayList.methods.add.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // Appends the specified element to the end of this list.
        List<String> list = new ArrayList<>();

        out.println(list);                                                                                 // Output: []
        out.println(list.add("A"));                                                                      // Output: true
        out.println(list.add("B"));                                                                      // Output: true
        out.println(list.add("C"));                                                                      // Output: true
        out.println(list);                                                                          // Output: [A, B, C]
    }
}
