package com.trl.theoreticalKnowledge.nestedClass.innerClass.initialization.b.b1;

import java.util.Objects;

public class Example {
    public static void main(String[] args) {
        Human human = new Human("Sapiens");
        Human.Arm arm_1 = human.new Arm("right");
        Human.Arm arm_2 = human.new Arm("left");
        System.out.println(arm_1);
        System.out.println(arm_2);

        System.out.println();
        Human.Arm arm_11 = new Human("Sapiens_2").new Arm("right");
        Human.Arm arm_22 = new Human("Sapiens_3").new Arm("left");
        System.out.println(arm_11);
        System.out.println(arm_22);
    }
}

class Human {

    String name;

    public Human(final String name) {
        this.name = name;
    }

    class Arm {
        String name;

        public Arm(final String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return Human.this.toString() + " --> Arm{" +
                    "name='" + name + '\'' +
                    '}' + " " + hashCode();
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            final Arm arm = (Arm) o;
            return Objects.equals(this.name, arm.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.name);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}' + " " + hashCode();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Human human = (Human) o;
        return Objects.equals(this.name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
}
