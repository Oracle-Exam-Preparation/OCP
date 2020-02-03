package com.trl.theoreticalKnowledge.objectMethods.equals.a.a2;

import java.util.Objects;

public class Example {
    public static void main(String[] args) {

        HumanPrent humanPrent_humanParent = new HumanPrent();
        HumanPrent humanPrent_humanChild = new HumanChild();
        System.out.println(humanPrent_humanParent.equals(humanPrent_humanChild));                    // Output: false.  The "equals()" method uses a "getClass()".

        AnimalParent animalParent_animalParent = new AnimalParent();
        AnimalParent animalParent_animalChild = new AnimalChild();
        System.out.println(animalParent_animalParent.equals(animalParent_animalChild));              // Output: true.  The "equals()" method uses a "instanceof".
    }
}

class HumanPrent {
    private String name;
    private int age;

    public HumanPrent() {
    }

    public HumanPrent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        HumanPrent that = (HumanPrent) o;

        return age == that.age &&
                Objects.equals(name, that.name);
    }
}

class HumanChild extends HumanPrent {
    private String name;
    private int age;

    public HumanChild() {
    }

    public HumanChild(String name, int age) {
        this.name = name;
        this.age = age;
    }
}




class AnimalParent {
    private String name;
    private int age;

    public AnimalParent() {
    }

    public AnimalParent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null) return false;

        if (!(o instanceof AnimalParent)) return false;

        AnimalParent that = (AnimalParent) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }
}

class AnimalChild extends AnimalParent {
    private String name;
    private int age;

    public AnimalChild() {
    }

    public AnimalChild(String name, int age, String name1, int age1) {
        super(name, age);
        this.name = name1;
        this.age = age1;
    }
}