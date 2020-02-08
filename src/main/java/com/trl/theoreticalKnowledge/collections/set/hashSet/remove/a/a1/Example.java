package com.trl.theoreticalKnowledge.collections.set.hashSet.remove.a.a1;

import static java.lang.System.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args) {

        // Removes the specified element from this set if it is present.
        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));

        out.println(set.remove("C"));   // Output: true
        out.println(set.remove("Z"));   // Output: false
    }
}
