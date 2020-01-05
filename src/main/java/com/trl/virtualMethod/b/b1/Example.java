/*
 * This example is taken from the book:         OCP Oracle® Certified
 *                                          Professional Java® SE 8
 *                                                Programmer II
 *
 * @link https://www.oreilly.com/library/view/ocp-oracle-certified/9781119067900/
 */

package com.trl.virtualMethod.b.b1;

public class Example {
    public static void main(String... args) {
        Animal animal = new Lion();
        animal.careFor();
    }
}

abstract class Animal {
    public void careFor() {
        play();
    }

    public void play() {
        System.out.println("pet animal");
    }
}

class Lion extends Animal {
    public void play() {
        System.out.println("toss in meat");
    }
}