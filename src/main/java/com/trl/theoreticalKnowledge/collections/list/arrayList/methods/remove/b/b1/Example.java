package com.trl.theoreticalKnowledge.collections.list.arrayList.methods.remove.b.b1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // Removes the first occurrence of the specified element from this list, if it is present.
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

        out.println(list);                                                  // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        out.println(list.remove(new Integer(1)));                   // Output: true
        out.println(list);                                                  // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2]
    }
}
