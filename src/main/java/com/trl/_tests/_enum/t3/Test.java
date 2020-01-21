package com.trl._tests._enum.t3;

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

1: public enum AnimalClasses {
2:   MAMMAL(true), FISH(Boolean.FALSE), BIRD(false),
3:   REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false)
4:   boolean hasHair;
5:   public AnimalClasses(boolean hasHair) {
6:     this.hasHair = hasHair;
7:   }
8:   public boolean hasHair() {
9:     return hasHair;
10:  }
11:  public void giveWig() {
12:    hasHair = true;
13: } }

A. Compiler error on line 2.
B. Compiler error on line 3.
C. Compiler error on line 5.
D. Compiler error on line 8.
E. Compiler error on line 12.
F. Compiler error on another line.
G. The code compiles successfully.

B, C. Enums are required to have a semicolon after the list of values if there is anything else in the enum.
Don’t worry ; you won’t be expected to track down missing semicolons on the whole exam—only on enum questions.
Enums are not allowed to have a public constructor.
*/