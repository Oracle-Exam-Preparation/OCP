/*
 * This class is created for educational purposes.
 * This class may contain sham information.
 * Always check the information you are learning.
 *
 * @author Tsyupryk Roman
 * @email tsyupryk.roman@gmail.com
 */

package com.trl.virtualMethod.fields.d.d1;

public class Practice {
    public static void main(String[] args) {
        action(new Child());
    }

    public static void action(Parent parent) {
        System.out.println(parent.name);
    }
}

class Parent {
    static String name = "Parent";
}

class Child extends Parent {
    static String name = "Child";
}