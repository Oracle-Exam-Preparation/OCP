package com.trl.theoreticalKnowledge.collections.list.arrayList.methods.remove.a.a1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

        out.println(list);                                                    // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        list.remove(1);
        out.println(list);                                                    // Output: [10, 8, 7, 6, 5, 4, 3, 2, 1]

        out.println();
        List<Integer> list_2 = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));

        out.println(list_2);                                                  // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        list_2.remove(new Integer(1));
        out.println(list_2);                                                  // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2]
    }
}
