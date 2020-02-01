package com.trl.theoreticalKnowledge.arrays.binarySearch.a.a1;

import static java.lang.System.out;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        int[] arr = {116, 104, 108, 100, 134, 103, 104};

        Arrays.sort(arr);
        // The array must be sorted (as by the sort(int[]) method) prior to making this call.
        out.println(Arrays.toString(arr));                                // Output: [100, 103, 104, 104, 108, 116, 134]

        out.println(Arrays.binarySearch(arr, 100));                                                   // Output: 0

        /// Value that are repeated.
        out.println(Arrays.binarySearch(arr, 104));                                                   // Output: 3

        // Not found that value.
        out.println(Arrays.binarySearch(arr, 10000));                                                // Output: -8
    }
}
