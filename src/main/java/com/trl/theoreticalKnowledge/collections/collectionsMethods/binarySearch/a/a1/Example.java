package com.trl.theoreticalKnowledge.collections.collectionsMethods.binarySearch.a.a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(116, 104, 108, 100, 134, 103, 104));

        Collections.sort(list);
        // The list must be sorted into ascending order according to the natural ordering of its elements (as by the sort(List) method) prior to making this call.
        System.out.println(list);                                         // Output: [100, 103, 104, 104, 108, 116, 134]

        System.out.println(Collections.binarySearch(list, 100));                                      // Output: 0

        // Value that are repeated.
        System.out.println(Collections.binarySearch(list, 104));                                      // Output: 3

        // Not found that value.
        System.out.println(Collections.binarySearch(list, 10000));                                   // Output: -8
    }
}
