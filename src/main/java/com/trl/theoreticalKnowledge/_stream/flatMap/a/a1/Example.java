package com.trl.theoreticalKnowledge._stream.flatMap.a.a1;

import static java.lang.System.out;
import static java.util.Arrays.asList;

import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> numbers = asList("1", "2", "3");
        List<String> characters = asList("A", "B", "C");

        // Cartesian product.
        numbers.stream()
                .flatMap(number -> characters.stream().map(character -> asList(number, character)))
                .forEach(out::print);
    }
}
