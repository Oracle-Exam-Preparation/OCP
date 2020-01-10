package com.trl.theoreticalKnowledge.virtualMethod.c.c3;

public class Example {
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
}
