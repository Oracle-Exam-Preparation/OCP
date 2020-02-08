package com.trl.theoreticalKnowledge.collections.set.sortedSet.navigableSet.treeSet.methods.higher.a.a1;

import static java.lang.System.out;
import static java.util.Arrays.asList;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {

        // Returns the least element in this set strictly greater than the given element, or null if there is no such element.

        Set<Integer> set = new TreeSet<>(asList(4, 1, 3, 2, 5));
        out.println(set);                             // Output: [1, 2, 3, 4, 5]
//        out.println(set.higher());                  // Compilation ERROR !!! Method "higher()" is from the interface NavigableSet.

        NavigableSet<Integer> navigableSet = new TreeSet<>(asList(4, 1, 3, 2, 5));
        out.println(navigableSet);                    // Output: [1, 2, 3, 4, 5]
        out.println(navigableSet.higher(3));      // Output: 4
        out.println(navigableSet.higher(100));    // Output: null

        TreeSet<Integer> treeSet = new TreeSet<>(asList(4, 1, 3, 2, 5));
        out.println(treeSet);                         // Output: [1, 2, 3, 4, 5]
        out.println(treeSet.higher(3));           // Output: 4
        out.println(treeSet.higher(100));         // Output: null

        TreeSet<Integer> treeSet_1 = new TreeSet<>();
        out.println(treeSet_1);                      // Output: []
        out.println(treeSet_1.higher(3));        // Output: null
        out.println(treeSet_1.higher(100));      // Output: null
    }
}
