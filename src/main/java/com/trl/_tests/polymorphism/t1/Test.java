package com.trl._tests.polymorphism.t1;

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
Which of the following statements can be inserted in the blank line so that the code will compile successfully? (Choose all that apply.)

public interface CanHop {}

public class Frog implements CanHop {
   public static void main(String[] args) {
      _______________ frog = new TurtleFrog();
   }
}

public class BrazilianHornedFrog extends Frog {}

public class TurtleFrog extends Frog {}

A. Frog
B. TurtleFrog
C. BrazilianHornedFrog
D. CanHop
E. Object
F. Long

A, B, D, E.
The blank can be filled with any class or interface that is a supertype of TurtleFrog. A is a superclass of TurtleFrog,
and B is the same class, so both are correct. BrazilianHornedFrog is not a superclass of TurtleFrog, so C is incorrect.
TurtleFrog inherits the CanHop interface, so D is correct. All classes inherit Object, so E is correct.
Finally, Long is an unrelated class that is not a superclass of TurtleFrog, and it is therefore incorrect.
*/