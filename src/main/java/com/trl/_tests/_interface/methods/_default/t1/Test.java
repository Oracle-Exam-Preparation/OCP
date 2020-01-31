package com.trl._tests._interface.methods._default.t1;

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

1: public interface CanWalk {
2: default void walk() { System.out.println("Walking"); }
3: }
4: public interface CanRun {
5: public default void walk() { System.out.println("Walking"); }
6: public abstract void run();
7: }
8: public interface CanSprint extends CanWalk, CanRun {
9: void sprint();
10: }

A. The code compiles without issue.
B. The code will not compile because of line 5.
C. The code will not compile because of line 6.
D. The code will not compile because of line 8.
E. The code will not compile because of line 9.

D.
While Java supports multiple inheritance through interfaces, it does not support method overriding in interfaces, since
it’s not clear which parent method should be used. In this example, CanWalk and CanRun both implement a default walk()
method. The definition of CanSprint extends these two interfaces and therefore won’t compile as two default methods with
the same signature from parent classes are detected, therefore the answer is D. None of the other lines of code cause
problems, so the rest of the answers are not correct.
*/
