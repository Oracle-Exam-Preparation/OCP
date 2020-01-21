package com.trl._tests.nestedClass.localInnerClass.t1;

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
What is the result of the following code?

1: public class Outer {
2:   private int x = 24;
3:   public int getX() {
4:     String message = "x is ";
5:     class Inner {
6:       private int x = Outer.this.x;
7:       public void printX() {
8:         System.out.println(message + x);
9:       }
10:    }
11:    Inner in = new Inner();
12:    in.printX();
13:    return x;
14:  }
15:  public static void main(String[] args) {
16:    new Outer().getX();
17:  } }

A. x is 0.
B. x is 24.
C. Line 6 generates a compiler error.
D. Line 8 generates a compiler error.
E. Line 11 generates a compiler error.
F. An exception is thrown.

B. Outer.this.x is the correct way to refer to x in the Outer class. In Java 7, the answer would have been D because you
used to have to declare variables as final to use them in a local inner class. In Java 8, this requirement was dropped
and the variables only need to be effectively final, which means that the code would still compile if final were added.
*/