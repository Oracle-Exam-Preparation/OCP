package com.trl.theoreticalKnowledge.nestedClass.innerClass.variables.a.a1;

public class Example {
    public static void main(String[] args) {

    }
}

class Human {

    private String name;

    class Arm {

        {
            System.out.println(name);
        }
    }

}
