package com.trl.theoreticalKnowledge.nestedClass.staticNestedClass.b.b1;

import java.util.Objects;

public class Example {
    public static void main(String[] args) {

        Human.Arm arm_11 = new Human.Arm("right");
        Human.Arm arm_22 = new Human.Arm("left");
        System.out.println(arm_11);
        System.out.println(arm_22);
    }
}

class Human {

    String name;

    public Human(final String name) {
        this.name = name;
    }

    static class Arm {
        String name;

        public Arm(final String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Arm{" +
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
