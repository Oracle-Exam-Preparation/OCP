package com.trl.theoreticalKnowledge.collections.list.arrayList.methods.set.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // Replaces the element at the specified position in this list with the specified element.
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        out.println(list);                                                                          // Output: [A, B, C]
        out.println(list.set(1, "-"));                                                              // Output: B
        out.println(list);                                                                          // Output: [A, -, C]
    }
}
