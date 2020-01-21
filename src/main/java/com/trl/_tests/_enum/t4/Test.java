package com.trl._tests._enum.t4;

/**
 * This test is taken from the book:         OCP: Oracle ®
 *                                       Certified Professional
 *                                      Java® SE 8 Programmer II
 *                                 by Scott Selikoff, Jeanne Boyarsky
 *                                       Released December 2015
 *                                        Publisher(s): Wiley
 *                                        ISBN: 9781119067900
 *
 * @link https://www.oreilly.com/library/view/ocp-oracle-certified/9781119067900/
 */
public class Test {
}

/*
What is the result of the following code? (Choose all that apply.)

public class Swimmer {
  enum AnimalClasses {
    MAMMAL,
    FISH {
      public boolean hasFins() { return true; }
    },
    BIRD, REPTILE, AMPHIBIAN, INVERTEBRATE;
    public abstract boolean hasFins();
  }

  public static void main(String[] args) {
    System.out.println(AnimalClasses.FISH);
    System.out.println(AnimalClasses.FISH.ordinal());
    System.out.println(AnimalClasses.FISH.hasFins());
    System.out.println(AnimalClasses.BIRD.hasFins());
  }
}

A. fish
B. FISH
C. 0
D. 1
E. false
F. true
G. The code does not compile.

G. This question appears to be about enums but is really about abstract methods. Just as an abstract superclass requires
concrete subclasses to have an implementation, abstract enum methods require each enum type to implement the method.
*/