package com.trl._tests.nestedClass.innerClass.t1;

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
2:     private int x = 5;
3:     protected class Inner {
4:         public static int x = 10;
5:         public void go() { System.out.println(x); }
6:     }
7:     public static void main(String[] args) {
8:         Outer out = new Outer();
9:         Outer.Inner in = out.new Inner();
10:        in.go();
11:    } }

A. The output is 5.
B. The output is 10.
C. Line 4 generates a compiler error.
D. Line 8 generates a compiler error.
E. Line 9 generates a compiler error.
F. An exception is thrown

C. Inner is a member inner class. Inner classes are not allowed to contain static methods or static variables. Only
nested static classes are permitted to contain statics.
*/