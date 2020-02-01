package com.trl.theoreticalKnowledge.collections.list.arrayList.methods.get.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        out.println(list);                                                    // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        out.println(list.get(1));                                                                           // Output: 9
        out.println(list.get(new Integer(1)));                                                      // Output: 9
    }
}
