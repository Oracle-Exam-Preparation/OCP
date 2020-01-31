package com.trl._tests.designPrinciplesAndDesignPatterns.designPatterns.javaBean.t1;

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
Which of the following are properties of classes that are properly encapsulated as a JavaBean? (Choose all that apply.)

A. All instance variables are marked final.
B. boolean instance variables are accessed with is or get.
C. All instance variables are marked private.
D. They implement the JavaBean interface.
E. Variables are created using lazy instantiation.
F. The first letter of the any getter/setter, after the get, set, or is prefix, must be uppercase.

B, C, F.
Options B, C, and F are each correct statements about JavaBean encapsulation.
A is incorrect, as that is a property of the immutable object pattern, not encapsulation.
D is incorrect, as there is no such JavaBean interface defined in the Java API.
Finally, E is incorrect, as handling instantiation is not part of encapsulation
*/