/*
 * This example is taken from the book:         OCP Oracle® Certified
 *                                          Professional Java® SE 8
 *                                                Programmer II
 *
 * @link https://www.oreilly.com/library/view/ocp-oracle-certified/9781119067900/
 */

package com.trl.virtualMethod.fields.b.b1;

public class Practice {
    public static void main(String... args) {
        Animal animal = new Lion();
        animal.printName();
    }
}

abstract class Animal {
    String name = "???";

    public void printName() {
        System.out.println(name);
    }
}

class Lion extends Animal {
    String name = "Leo";
}