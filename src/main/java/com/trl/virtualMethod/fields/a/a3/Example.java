/*
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 */

package com.trl.virtualMethod.fields.a.a3;

public class Example {
    public static void main(String[] args) {
        Animal animal_1 = new Cow();
        animal_1.feed();

        Animal animal_2 = new Bird();
        animal_2.feed();

        Animal animal_3 = new Lion();
        animal_3.feed();
    }
}

abstract class Animal {
    private String name = "Animal";

    public void feed() {
        System.out.println(name + " feed() !!!");
    }

    ;
}

class Cow extends Animal {
    private String name = "Cow";

    public void feed() {
        System.out.println(name + " feed() !!!");
    }
}

class Bird extends Animal {
    private String name = "Bird";

    public void feed() {
        System.out.println(name + " feed() !!!");
    }
}

class Lion extends Animal {
    private String name = "Lion";

    public void feed() {
        System.out.println(name + " feed() !!!");
    }
}
