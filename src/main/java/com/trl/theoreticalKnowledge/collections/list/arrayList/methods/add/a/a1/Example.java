package com.trl.theoreticalKnowledge.collections.list.arrayList.methods.add.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        out.println(list);                                                                                 // Output: []
        list.add("A");
        list.add("B");
        list.add("C");
        out.println(list);                                                                          // Output: [A, B, C]

        list.add(1, "-");
        out.println(list);                                                                       // Output: [A, -, B, C]
    }
}
