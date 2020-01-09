package com.trl.nestedClass.innerClass.localInnerClass.b.b1;

import java.util.Random;

public class Example {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.generateNickname());
    }
}

class Person {
    private String name = "Jek";

    public String generateNickname() {
        String nickname = "";

        class GeneratorNickname {
            public String generate() {
                return name + (new Random().nextInt());
            }
        }
        GeneratorNickname generatorNickname = new GeneratorNickname();
        return generatorNickname.generate();
    }
}
