/*
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 */

package com.trl.virtualMethod.c.c2;

public class Practice {
    public static void main(String[] args) {
        action(new Child());
    }

    public static void action(Grandfather grandfather) {
        grandfather.work();
    }
}

interface Grandfather {
    void work();
}

class Parent implements Grandfather {
    public void work() {
        System.out.println("Parent work !!!");
    }
}

class Child extends Parent {
    public void work() {
        System.out.println("Child work !!!");
    }
}