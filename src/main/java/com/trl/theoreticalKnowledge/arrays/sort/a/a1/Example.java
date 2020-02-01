package com.trl.theoreticalKnowledge.arrays.sort.a.a1;

import static java.lang.System.*;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        int [] arr = new int[10];
        arr [0] = 10;
        arr [1] = 1;
        arr [2] = 8;
        arr [3] = 3;

        out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        out.println(Arrays.toString(arr));
    }
}
