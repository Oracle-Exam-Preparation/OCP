package com.trl.theoreticalKnowledge.designPrinciples.encapsulationData.b.b1;

public class Example {
    public static void main(String[] args) {
        Animal animal = new Animal("someName", 10, true, true);
        animal.setName("someName_2");
        animal.setAge(11);
        animal.setCanSwim(true);
        animal.setCanRun(true);
    }
}

class Animal {

    private String name;
    private int age;
    private boolean canSwim;
    private Boolean canRun;

    public Animal(String name, int age, boolean canSwim, Boolean canRun) {
        this.name = name;
        this.age = age;
        this.canSwim = canSwim;
        this.canRun = canRun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public Boolean getCanRun() {
        return canRun;
    }

    public void setCanRun(Boolean canRun) {
        this.canRun = canRun;
    }
}
