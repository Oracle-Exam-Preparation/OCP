package com.trl.virtualMethod.c.c1;

public class Practice {
    public static void main(String[] args) {
        action(new Child());
    }

    public static void action(Parent parent) {
        parent.work();
    }
}

class Parent {
    void work() {
        System.out.println("Parent work !!!");
    }
}

class Child extends Parent {
    void work() {
        System.out.println("Child work !!!");
    }
}