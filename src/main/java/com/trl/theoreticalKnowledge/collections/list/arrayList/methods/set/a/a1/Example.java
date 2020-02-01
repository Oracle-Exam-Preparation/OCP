package com.trl.theoreticalKnowledge.collections.list.arrayList.methods.set.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        out.println(list);                                                                          // Output: [A, B, C]
        list.set(1, "-");
        out.println(list);                                                                          // Output: [A, -, C]
    }
}
