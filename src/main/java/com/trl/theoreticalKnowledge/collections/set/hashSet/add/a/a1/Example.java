package com.trl.theoreticalKnowledge.collections.set.hashSet.add.a.a1;

import static java.lang.System.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args) {

        // Adds the specified element to this set if it is not already present.
        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));

        out.println(set.add("D"));   // Output: true
        out.println(set.add("D"));   // Output: false
    }
}
