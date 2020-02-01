package com.trl.theoreticalKnowledge.collections.collectionsMethods.sort.a.a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(16, 4, 8, 0, 34, 3, 4));

        System.out.println(list);                                                     // Output: [16, 4, 8, 0, 34, 3, 4]
        System.out.println();

        Collections.sort(list);
        System.out.println(list);                                                     // Output: [0, 3, 4, 4, 8, 16, 34]
        System.out.println();

        List<Integer> list_2 = new ArrayList<>(Arrays.asList(16, 4, 8, 0, 34, 3, 4));

        System.out.println(list_2);                                                   // Output: [16, 4, 8, 0, 34, 3, 4]
        System.out.println();

        Collections.sort(list_2, Collections.reverseOrder());
        System.out.println(list_2);                                                   // Output: [34, 16, 8, 4, 4, 3, 0]
        System.out.println();
    }
}
