package com.trl.theoreticalKnowledge.array.a.a1;

public class Example {
    public static void main(String[] args) {
        Integer[] numbers = { new Integer(42)};
        Object[] objects = numbers;
        objects[0] = "forty two";                                               // Runtime ERROR !!! ArrayStoreException
    }
}