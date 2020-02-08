package com.trl.theoreticalKnowledge.collections.list.arrayList.methods.add.b.b1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // Inserts the specified element at the specified position in this list.
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        out.println(list);                                                                        // Output: [A, B, C]

//        out.println(list.add(1, "-"));                                                          // Compilation ERROR !!! void add (int index, E element).
        list.add(1, "-");
        out.println(list);                                                                       // Output: [A, -, B, C]
    }
}
