package com.trl.theoreticalKnowledge.collections.set.sortedSet.navigableSet.treeSet.methods.floor.a.a1;

import static java.lang.System.out;
import static java.util.Arrays.asList;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {

        // Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.

        Set<Integer> set = new TreeSet<>(asList(4, 1, 3, 2, 5));
        out.println(set);                             // Output: [1, 2, 3, 4, 5]
//        out.println(set.floor());                   // Compilation ERROR !!! Method "floor()" is from the interface NavigableSet.

        NavigableSet<Integer> navigableSet = new TreeSet<>(asList(4, 1, 3, 2, 5));
        out.println(navigableSet);                    // Output: [1, 2, 3, 4, 5]
        out.println(navigableSet.floor(3));       // Output: 3
        out.println(navigableSet.floor(100));     // Output: 5

        TreeSet<Integer> treeSet = new TreeSet<>(asList(4, 1, 3, 2, 5));
        out.println(treeSet);                         // Output: [1, 2, 3, 4, 5]
        out.println(treeSet.floor(3));            // Output: 3
        out.println(treeSet.floor(100));          // Output: 5

        TreeSet<Integer> treeSet_1 = new TreeSet<>();
        out.println(treeSet_1);                      // Output: []
        out.println(treeSet_1.floor(3));         // Output: null
        out.println(treeSet_1.floor(100));       // Output: null
    }
}
