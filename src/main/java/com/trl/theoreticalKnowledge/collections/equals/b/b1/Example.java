package com.trl.theoreticalKnowledge.collections.equals.b.b1;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B"));
        ArrayList<String> arrayList_2 = new ArrayList<>(Arrays.asList("B", "A"));

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B"));
        LinkedList<String> linkedList_2 = new LinkedList<>(Arrays.asList("B", "A"));

        out.println(arrayList.equals(linkedList));                                                       // Output: true
        out.println(arrayList.equals(linkedList_2));                                                    // Output: false
        out.println(arrayList.equals(arrayList_2));                                                     // Output: false

        out.println();
        out.println(linkedList.equals(arrayList));                                                       // Output: true
        out.println(linkedList.equals(arrayList_2));                                                    // Output: false
        out.println(linkedList.equals(linkedList_2));                                                   // Output: false
    }
}
